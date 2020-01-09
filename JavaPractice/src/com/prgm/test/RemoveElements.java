package com.prgm.test;

import java.util.ArrayList;
import java.util.List;

public class RemoveElements {

	public static List<String> test(List<String> strArray, int burstLength) {
		StringBuilder sb = new StringBuilder();

		for (String strTemp : strArray) {
			sb.append(strTemp);
		}
		String str = sb.toString();

		char[] ch = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 1;
			boolean flag = true;
			char temp = ' ';
			for (int j = i + 1; j < ch.length - 1; j++) {
				if (ch[i] == ch[j]) {
					count++;
					if (count >= burstLength) {
						flag = false;
						temp = ch[j];
						break;
					}
				}
			}
			if (!flag) {
				i = 0;
				str = str.replaceAll(String.valueOf(temp), "");
				ch = str.toCharArray();

			}

		}

		char[] resultArray = str.toCharArray();
		List<String> list = new ArrayList<>();
		for (char c : resultArray) {
			list.add(String.valueOf(c));
		}
		return list;

	}

	public static void main(String[] args) {
		List<String> strArray = new ArrayList<String>();
		strArray.add("a");
		strArray.add("b");
		strArray.add("c");
		strArray.add("d");
		strArray.add("e");
		strArray.add("e");
		strArray.add("e");
		strArray.add("e");
		strArray.add("d");
		strArray.add("d");
		strArray.add("c");
		strArray.add("b");
		strArray.add("f");
		strArray.add("g");
		strArray.add("f");

		List<String> list = test(strArray, 3);
		list.forEach(e -> System.out.println(e));

	}

}
