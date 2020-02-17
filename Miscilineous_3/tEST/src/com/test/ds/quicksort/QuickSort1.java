package com.test.ds.quicksort;

import java.util.Arrays;

public class QuickSort1 {
	public static void sort(int[] array, int low, int high) {
		if (low < high) {
			int pi = pratitionIndex(array, low, high);
			sort(array, low, pi - 1);
			sort(array, pi + 1, high);
		}

	}

	public static int pratitionIndex(int[] array, int low, int high) {
		int i = low - 1;
		int pivot = array[high];
		for (int j = low; j < high; j++) {
			if (array[j] <= pivot) {
				i++;
				int temp = array[i];
				array[i] = array[j];
				array[j] = temp;

			}

		}
		int temp = array[i + 1];
		array[i + 1] = array[high];
		array[high] = temp;
		return i + 1;
	}

	public static void main(String[] args) {
		int[] array = { 10, 7, 8, 9, 1, 5 };
		sort(array, 0, array.length - 1);
		System.out.println(Arrays.toString(array));

	}

}
