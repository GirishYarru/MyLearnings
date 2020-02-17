package com.test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

public class Solution {

	public static void calculate(List<String> list) {
		Map<String, Integer> map = new LinkedHashMap<>();
		for (String str : list) {

			if (str.equals("top")) {
				String key = map.entrySet().stream()
						.max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1).get().getKey();
				int temp = map.get(key);
				TreeSet<String> sortKeys = new TreeSet<>();
				for (String keys : map.keySet()) {
					if (temp == map.get(keys)) {
						sortKeys.add(keys);
					}
				}
				String print = "";
				for (String printKey : sortKeys) {
					print = print + printKey + " ";

				}
				System.out.print(print.trim());
				System.out.println();
			} else {
				String[] strArray = str.split(" ");
				if (map.get(strArray[0]) == null)
					map.put(strArray[0], Integer.valueOf(strArray[1]));
				else
					map.put(strArray[0], map.get(strArray[0]) + Integer.valueOf(strArray[1]));

			}

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCases = sc.nextInt();
		for (int i = 0; i < testCases; i++) {
			int combineLines = sc.nextInt();
			sc.nextLine();
			List<String> list = new ArrayList<String>();
			for (int j = 0; j < combineLines; j++) {
				String value = sc.nextLine();
				list.add(value);
			}
			calculate(list);
		}

	}

}
