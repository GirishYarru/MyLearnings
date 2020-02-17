package com.test.ds.practice.oe;

public class MergeSort {

	public void mergeSort(int[] arr, int n) {
		int[] temp = new int[n];
		sort(arr, temp, 0, n-1);

	}

	public void sort(int[] arr, int[] temp, int low, int up) {
		if (low == up) {
			return;
		}
		int mid = (low + up) / 2;
		sort(arr, temp, low, mid);
		sort(arr, temp, mid + 1, up);
		merge(arr, temp, low, mid, mid + 1, up);
		copy(arr, temp, low, up);

	}

	public void merge(int[] arr, int[] temp, int low1, int up1, int low2, int up2) {
		int i = low1;
		int j = low2;
		int k = low1;

		while (i <= up1 && j <= up2) {
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			} else {
				temp[k++] = arr[j++];
			}

		}
		while (i <= up1) {
			temp[k++] = arr[i++];
		}
		while (j <= up2) {
			temp[k++] = arr[j++];
		}

	}

	public void copy(int[] arr, int[] temp, int low, int up) {
		for (int i = 0; i <= up; i++) {
			arr[i] = temp[i];

		}

	}

	public static void main(String[] args) {
		int[] arr = { 47, 4, 15, 35, 52, 18, 56, 5, 12, 51, 9 };
		MergeSort MergeSort = new MergeSort();
		MergeSort.mergeSort(arr, 11);

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

	}

}
