package com.sortmap.keys;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortByKeys {
	public static void main(String[] args) {
		Map< Integer, String> map = new HashMap<>();
		map.put(1, "d");
		map.put(3, "a");
		map.put(2, "b");
		map.put(4, "c");
		
		TreeMap< Integer, String> sortedKeys = new TreeMap<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		sortedKeys.putAll(map);
		System.out.println(sortedKeys);

		
	}

}
