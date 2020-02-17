package com.cognizant.practice;

public class FindUniqueElement {
	public static void findUniqueElement(int[] arr) {
		int count;
		for (int i = 0; i < arr.length; i++) {
			count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
					if (count >= 2)
						break;
				}
			}
			if (count == 1)
				System.out.println("unique element is: " + arr[i]);
		}
	}

	public static void findUniqueElementSorted(int[] arr) {
		if (arr.length == 0) {
			System.out.println("No elements found in array");
		} else if (arr.length == 1)
			System.out.println("Unique element is :: " + arr[0]);
		else {
			for (int i = 0; i < arr.length - 1; i++) {
				if (i == 0 && arr[i] != arr[i + 1]) {
					System.out.println("Unique element is :: " + arr[i]);
				} else if (arr[i] != arr[i + 1] && arr[i] != arr[i - 1]) {
					System.out.println("Unique element is :: " + arr[i]);
				}
			}
			if (arr[arr.length - 1] != arr[arr.length - 2]) {
				System.out.println("Unique element is :: " + arr[arr.length - 1]);

			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 10, 20, 20, 20, 30, 40, 40 };
		findUniqueElement(arr);

		int[] arr1 = { 10,10,20,30,30};
		findUniqueElementSorted(arr1);
	}

}
