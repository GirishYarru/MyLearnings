package com.cognizant.practice;

import java.util.HashMap;
import java.util.Map;

public class FindPair {
	
	public static void findPairs(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.get(sum - arr[i]) == null) {
				map.put(arr[i], i);
			} else {
				System.out.println(arr[i] + " and  " + arr[map.get(sum - arr[i])] + " are pairs");

			}

		}

	}

	public static void main(String[] args) {
		int[] arr = { 5, 3, 5, 7, 2, 8, 4 };
		findPairs(arr, 10);
	}
}
