package com.test.ds.binarysearch;

public class BinarySearch {
	public int binarySearch(int[] arr, int low, int up, int item) {
		int mid;
		if (up >= low) {
			mid = (low + up) / 2;
			if (arr[mid] == item) {
				return mid + 1;
			}
			if (arr[mid] < item) {
				return binarySearch(arr, mid + 1,up, item);
			} else {
				return binarySearch(arr, low, mid - 1, item);

			}

		}

		return -1;
	}

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] arr = {1,2,3,4,5,6};
		int index = binarySearch.binarySearch(arr, 0, arr.length-1, 3);
		System.out.println("index found "+ index);

	}

}
