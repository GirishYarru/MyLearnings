package com.test.ds.bubblesort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BubbleSort {
	public static void main(String[] args) {
		int[] array = { 5, 3, 6, 1, 10, 7 };
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
				System.out.println(Arrays.toString(array));
			}

		}
		for(int k =0;k<array.length;k++) {
			System.out.print(array[k]+" ");
		}
	}

}
