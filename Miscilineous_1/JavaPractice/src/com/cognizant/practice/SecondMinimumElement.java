package com.cognizant.practice;

public class SecondMinimumElement {
	public static int findSecondMinElement(int[] arr) {
		int firstMin = Integer.MAX_VALUE;
		int secondMin = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < firstMin) {
				secondMin = firstMin;
				firstMin = arr[i];
			} else if (arr[i] < secondMin) {
				secondMin = arr[i];

			}

		}
		return secondMin;

	}

	public static void main(String[] args) {
		int[] arr = { 3, 8, 4, 8, 2, 1,1, 10 };
		int result = findSecondMinElement(arr);
		System.out.println(result);
	}

}
