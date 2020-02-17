package com.stack.using.array;

import java.util.Arrays;

public class StackUsingArray {
	private int[] arr;
	private int size = 0;

	StackUsingArray() {
		arr = new int[10];
	}

	StackUsingArray(int size) {
		arr = new int[size];
	}

	public void add(int element) {
		if (isFull())
			increaseCapacity();
		arr[size++] = element;

	}

	public int get(int i) {
		if (i >= size || i < 0)
			throw new ArrayIndexOutOfBoundsException("Index out of range");
		return arr[i];
	}

	private boolean isFull() {
		return size == arr.length;
	}

	private void increaseCapacity() {
		int newSize = size * 2;
		arr = Arrays.copyOf(arr, newSize);
	}

}
