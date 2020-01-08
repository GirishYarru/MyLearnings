package com.java8.streams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOperations {
	public static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
		Set<Object> seen = ConcurrentHashMap.newKeySet();
		return t -> seen.add(keyExtractor.apply(t));
	}

	public static void main(String[] args) {
		EmployeeStream e1 = new EmployeeStream(1, "aaa");
		EmployeeStream e2 = new EmployeeStream(2, "bbb");
		EmployeeStream e3 = new EmployeeStream(2, "ccc");
		EmployeeStream e4 = new EmployeeStream(2, "ddc");
		EmployeeStream e5 = new EmployeeStream(1, "aaa");

		List<EmployeeStream> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);

		// 1)filter -> allows predicate argument
		System.out.println("1)Filter list if employeeName contains letter c");
//		Predicate<EmployeeStream> p = (e)->{
//			return e.getName().contains("c");
//		};
		Stream<EmployeeStream> strStream = list.stream().filter(e -> e.getName().contains("c"));
		List<EmployeeStream> empNameList = strStream.collect(Collectors.toList());
		empNameList.forEach(e -> System.out.println(e.getName()));
		System.out.println("1)Filter Map by keys");
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "apple");
		map.put(10, "pineapple");
		map.put(12, "papaya");
		map.put(6, "guava");
		map.put(7, "banana");
		Map<Integer, String> filterByKeys = map.entrySet().stream().filter(e -> e.getKey().intValue() <= 10)
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		System.out.println(filterByKeys);

		System.out.println("1)Filter Map by values");
		Map<Integer, String> filterByValues = map.entrySet().stream().filter(e -> "papaya".equals(e.getValue()))
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		System.out.println(filterByValues);

		System.out.println("1)Filter Map by both keys and values");
		Map<Integer, String> filterByKeysValues = map.entrySet().stream().filter(e -> e.getKey().intValue() <= 10)
				.filter(e -> "guava".equals(e.getValue()))
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		System.out.println(filterByKeysValues);

		// map - which allows Function
		System.out.println("2)Map - collect only employee id's");
		Function<Integer, Integer> f = (a) -> a * 2;
		List<Integer> empIdList = list.stream().map(EmployeeStream::getId).collect(Collectors.toList());
		System.out.println(empIdList);
		// print length of names
		System.out.println("2.1)Map - print length of employee names length");
		list.stream().map(e -> {
			System.out.println("hello");
			return 2;
		}).forEach(e -> System.out.println(e));
		System.out.println("2.2)MapToInt - returns input stream after processing the function operations");
		List<String> strList = new ArrayList<>();
		strList.add("6");
		strList.add("4");
		strList.add("1");
		strList.add("2");
		strList.add("3");
		strList.add("3");
		strList.stream().mapToInt(Integer::valueOf).forEach(System.out::print);
		System.out.println();
		System.out.println("3) distinct stream example");
		strList.stream().distinct().forEach(e -> System.out.println(e));
		System.out.println("4) sorted stream example");
		list.stream().sorted().forEach(e -> System.out.println(e.getId() + " " + e.getName()));
		System.out.println("4.1) sorted stream example - comparator");
		list.stream().sorted((o1, o2) -> o2.getId() - o1.getId())
				.forEach(e -> System.out.println(e.getId() + " " + e.getName()));
		System.out.println("5) limit stream example");
		list.stream().sorted((o1, o2) -> o2.getId() - o1.getId()).limit(1)
				.forEach(e -> System.out.println(e.getId() + " " + e.getName()));

	}

}
