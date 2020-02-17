package com.test.ds.practice.oe;

public class BinarySearch {

	public int binarySearch(int arr[], int begin, int end, int item) {
		int mid;
		if (end >= begin) {
			mid = (begin + end) / 2;
			if (arr[mid] == item) {
				return mid;
			}

			if (arr[mid] < item) {
				return binarySearch(arr, mid + 1, end, item);
			} else {
				return binarySearch(arr, begin, mid - 1, item);

			}
		}
		return -1;

	}

	public static void main(String[] args) {
		BinarySearch binary = new BinarySearch();
		int[] array = {1,2,3,4,5,6};
		System.out.println(binary.binarySearch(array, 0, 5, 5));

	}

}
