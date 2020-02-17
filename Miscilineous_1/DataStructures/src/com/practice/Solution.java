package com.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	private static List<Integer> list = new ArrayList<>();

	static boolean shouldSwap(char str[], int start, int curr) {
		for (int i = start; i < curr; i++) {
			if (str[i] == str[curr]) {
				return false;
			}
		}
		return true;
	}

	static void findPermutations(char str[], int index, int n) {
		if (index >= n) {
			int decimal = Integer.parseInt(new String(str), 2);
			list.add(decimal);

			return;
		}

		for (int i = index; i < n; i++) {
			boolean check = shouldSwap(str, index, i);
			if (check) {
				swap(str, index, i);
				findPermutations(str, index + 1, n);
				swap(str, index, i);
			}
		}
	}

	static void swap(char[] str, int i, int j) {
		char c = str[i];
		str[i] = str[j];
		str[j] = c;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			int number = sc.nextInt();
			String binarySTr = Integer.toBinaryString(number);
			char str[] = binarySTr.toCharArray();
			int n = str.length;
			findPermutations(str, 0, n);
			Integer sum = list.stream().mapToInt(Integer::intValue).sum();
			list.clear();
			System.out.println(sum);
		}

	}

}
