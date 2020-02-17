package com.cognizant.practice;

public class MinimumDistance {
	public static int findMinDistance(int[] arr, int a, int b) {
		int diff = Integer.MAX_VALUE;
		int aIndex = -1;
		int bIndex = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == a)
				aIndex = i;
			if (arr[i] == b)
				bIndex = i;
			if (aIndex != -1 && bIndex != -1) {
				if (diff > Math.abs(aIndex - bIndex))
					diff = Math.abs(aIndex - bIndex);
			}

		}
		return diff;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 1, 3, 2, 2, 2, 2, 5, 1, 4, 5, 9, 3, 6, 5 };
		int result = findMinDistance(arr, 3, 5);
		System.out.println(result);

	}

}
