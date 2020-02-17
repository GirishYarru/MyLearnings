package com.oddTOLeft.evemTORight;

import java.util.Arrays;

public class OddEvenTest {
	public static int[] arrangeOddEven(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] % 2 == 0) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		return arr;

	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 8, 7, 9, 6, 10 };
		System.out.println(Arrays.toString(arrangeOddEven(arr)));
	}

}
