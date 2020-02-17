package com.test.ds.practice.oe;

import java.util.HashMap;

public class TwoStringsAnagrams {

	public static boolean checkIfTwoStringAreAnagrams(String s1, String s2) {
		HashMap<Character, Integer> hmap1 = new HashMap<>();
		HashMap<Character, Integer> hmap2 = new HashMap<>();
		char[] arr1 = s1.toCharArray();
		char[] arr2 = s2.toCharArray();
		for (int i = 0; i < arr1.length; i++) {
			if (hmap1.get(arr1[i]) == null) {
				hmap1.put(arr1[i], 1);
			} else {
				int temp = hmap1.get(arr1[i]);
				hmap1.put(arr1[i], temp+1);

			}
		}

		for (int i = 0; i < arr2.length; i++) {
			if (hmap2.get(arr2[i]) == null) {
				hmap2.put(arr2[i], 1);
			} else {
				int temp = hmap2.get(arr2[i]);
				hmap2.put(arr2[i], temp+1);

			}
		}
		if (hmap1.equals(hmap2)) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {
		System.out.println(checkIfTwoStringAreAnagrams("geeksforgeeks", "forgeeksgeeks"));

	}

}
