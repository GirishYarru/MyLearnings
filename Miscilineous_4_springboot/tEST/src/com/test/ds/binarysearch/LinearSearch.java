package com.test.ds.binarysearch;

public class LinearSearch {
	public int linearSearch(int[] arr,int item) {
		for(int i =0;i<arr.length;i++) {
			if(arr[i] == item) {
				return i;
			}
		}
		
		return -1;
		
	}

	public static void main(String[] args) {
		int[] arr = {4,5,6,1,2,4};
		LinearSearch linearSearch = new LinearSearch();
		int index = linearSearch.linearSearch(arr, 1);
		System.out.println(index);
		

	}

}
