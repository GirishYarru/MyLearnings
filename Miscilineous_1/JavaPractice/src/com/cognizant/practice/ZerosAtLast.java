package com.cognizant.practice;

import java.util.Arrays;

public class ZerosAtLast {
	public static int[] moveAllOccurancesOfZeroToLast(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 0) {
				for (int j = i + 1; j < arr.length; j++) {
					if (arr[j] != 0) {
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

	public static void main(String[] args) {
		int[] arr = { 0, 1, 0, 1, 1, 1, 0, 0, 1 };
		int[] result = moveAllOccurancesOfZeroToLast(arr);
		System.out.println(Arrays.toString(result));
	}

}
