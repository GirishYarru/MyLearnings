package com.cognizant.practice.Day2;

public class DifferentElement {

	public static int findDifferentElement(int[] arr) {
		if (arr.length == 1 || arr.length == 2) {
			// array length should be minimum 3
			return -1;
		}
		for (int i = 0; i < arr.length - 3; i++) {
			if (arr[i] != arr[i + 1] && arr[i] != arr[i + 2]) {
				return i;
			} else if (arr[i] == arr[i + 1] && arr[i] != arr[i + 2]) {
				return i + 2;
			} else if (arr[i] == arr[i + 2] && arr[i] != arr[i + 1]) {
				return i + 1;
			}

		}
		return -1;

	}

	public static void main(String[] args) {
		int[] arr = { 30, 10, 30, 30, 30 };
		int result = findDifferentElement(arr);
		System.out.println(result);

	}

}
