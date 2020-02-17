package com.test.ds.quicksort;

import java.util.Arrays;

public class QuickSort2 {
	public static void quickSort(int[] a, int low, int high) {
		if(low>high)
			return;
		int mid = low + (high-low) / 2;
		int i = low;
		int j = high;

		while (i <= j) {

			while (a[i] < a[mid]) {
				i++;
			}
			while (a[j] > a[mid]) {
				j--;
			}
			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
			}

		}

		if (low < j) {
			quickSort(a, low, j);

		}
		if (high > i) {
			quickSort(a, i, high);

		}

	}

	public static void main(String[] args) {
		int[] a = { 5, 3, 7, 9, 2, 10, 11, 1 ,0};
		//int[] a = { 15, 4, 5, 89, 25, 45,84};
		//int[] a = { 50,30,10,60,80};

		quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

}
