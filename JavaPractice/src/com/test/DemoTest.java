package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoTest {

	public static int returnCount(int a, int b) {

		int lovelyCount = 0;
		boolean flag = true;

		for (int i = a; i <= b; i++) {
			String str = String.valueOf(i);
			Map<Integer, Integer> map = new HashMap<Integer, Integer>();
			char[] ch = str.toCharArray();
			for (int j = 0; j < ch.length; j++) {
				if (map.get(Integer.valueOf(ch[j])) == null) {
					map.put(Integer.valueOf(ch[j]), 1);
				} else {
					map.put(Integer.valueOf(ch[j]), map.get(Integer.valueOf(ch[j])) + 1);

				}

			}

			List<Integer> list = new ArrayList<Integer>(map.values());
			for (Integer value : list) {
				if (value >= 3) {
					flag = false;
					break;

				}
			}

			if (flag) {
				lovelyCount++;
			}

		}
		return lovelyCount;

	}

	public static void main(String[] args) {

		System.out.println(returnCount(100000, 100000));

	}

}
