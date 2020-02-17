package com.cognizant.practice.Day2;

public class CountPairsInSortedArrayLesserProduct {
	// find pairs in sorted array with product less than k
	public static int CountPairsInSortedArrayProduct(int[] arr, int k) {
		int count = 0;
		int j = arr.length - 1;
		int i = 0;
		while (i < j) {
			if (arr[i] * arr[j] < k) {
				count = count + j - i;
				i++;
			} else {
				j--;
			}

		}

		return count;

	}

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 6, 9 };
		int count = CountPairsInSortedArrayProduct(arr, 20);
		System.out.println(count);

	}

}
