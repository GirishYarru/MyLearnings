package com.test.ds.selectionsort;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] array = { 5, 3, 6, 1, 10, 7 };//1,3,6,5,10,7
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}

			}

		}
		
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]);
		}
System.out.println("i++--------------------");
		for(int i=0;i<3;i++) {
			int y = i;
			System.out.println(y++);
			System.out.println(y);

		}
		System.out.println("++i--------------------");
		for(int i=0;i<3;++i) {
			int y = i;
			System.out.println(++y);
			System.out.println(y);

		}
	}

}
