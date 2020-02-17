package com.cognizant.practice;

import java.util.Arrays;

public class SeggregateOddEven {

	public static int[] arrangeOddEvenNumbersWithOutOrder(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] % 2 == 0) {
						int temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
						break;
					}
				}
			}

		}
		return arr;
	}

	public static int[] arrangeOddEvenNumbersWithOrder(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 != 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] % 2 == 0) {
						int temp1 = arr[j];
						for (int k = j; k > i; k--) {
							arr[k] = arr[k - 1];
						}
						arr[i] = temp1;
						break;
					}

				}
			}

		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] result_with_out_order = arrangeOddEvenNumbersWithOutOrder(arr);
		System.out.println("With out maintaining order:: " + Arrays.toString(result_with_out_order));

		int[] arr1 = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int[] result_with_order = arrangeOddEvenNumbersWithOrder(arr1);
		System.out.println("With maintaining order:: " + Arrays.toString(result_with_order));

	}

}