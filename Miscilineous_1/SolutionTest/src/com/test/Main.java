package com.test;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

// Program to get Map's key from value in Java
class Main {
	public static <K, V> K getKey(Map<K, V> map, V value) {
		return map.entrySet()
						.stream()
						.filter(entry -> value.equals(entry.getValue()))
						.map(Map.Entry::getKey)
						.findFirst().get();
	}

	public static void main(String[] args) {
		Map<String, Integer> hashMap = new HashMap();
		hashMap.put("A", 1);
		hashMap.put("B", 2);
		hashMap.put("C", 2);

		System.out.println(getKey(hashMap, 2));
	}
}