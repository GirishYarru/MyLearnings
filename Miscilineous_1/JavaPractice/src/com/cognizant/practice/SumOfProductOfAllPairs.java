package com.cognizant.practice;

public class SumOfProductOfAllPairs {
	public static int findSumOfProductPairs(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				sum = sum + arr[i] * arr[j];
			}

		}
		return sum;

	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3 };
		int result = findSumOfProductPairs(arr);
		System.out.println(result);
	}

}
