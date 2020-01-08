package com.java8.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamsCreation {
	public static void main(String[] args) {
		EmployeeStream e1 = new EmployeeStream(1, "aaa");
		EmployeeStream e2 = new EmployeeStream(2, "bbb");
		// 1) from existing array
		System.out.println("Streams creation using arrays");
		EmployeeStream[] employeeArray = new EmployeeStream[2];
		employeeArray[0] = e1;
		employeeArray[1] = e2;
		Stream<EmployeeStream> st = Stream.of(employeeArray);
		st.forEach(e -> {
			System.out.println(e.getName());
		});

		// 2)from list
		System.out.println("Streams creation using list");
		List<EmployeeStream> list = new ArrayList<>();
		list.add(e1);
		list.add(e2);
		Stream<EmployeeStream> listStream = list.stream();
		listStream.forEach(e -> System.out.println(e.getName()));

		// 3) using individual object
		System.out.println("Streams creation using individual objects");
		Stream<EmployeeStream> s = Stream.of(e1, e2);
		s.forEach(e -> System.out.println(e.getName()));

		// 4) using stream builder
		System.out.println("Streams creation using stream builder");
		Stream.Builder<EmployeeStream> empStreamBuilder = Stream.builder();
		empStreamBuilder.accept(e1);
		empStreamBuilder.accept(e2);
		Stream<EmployeeStream> sb = empStreamBuilder.build();
		sb.forEach(e -> System.out.println(e.getName()));

	}

}
