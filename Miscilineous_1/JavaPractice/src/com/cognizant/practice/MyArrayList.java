package com.cognizant.practice;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyArrayList<E> {
	private Object[] dataStore;
	private int size;

	public MyArrayList() {
		dataStore = new Object[10];
	}

	// 1)add method
	public boolean add(Object o) {

		if (dataStore.length - size <= 0) {
			increaseCapacity();
		}
		dataStore[size] = o;
		size++;
		return true;

	}

	private void increaseCapacity() {
		dataStore = Arrays.copyOf(dataStore, dataStore.length + 10);
	}

	// 2)get method
	public Object get(int index) {
		checkRange(index);
		return dataStore[index];

	}

	private void checkRange(int index) {
		if (index > size)
			throw new IndexOutOfBoundsException();

	}
	// 3)remove method

	public E remove(int index) {
		checkRange(index);
		E removedValue = (E) dataStore[index];
		int dataMov = size - index - 1;
		System.arraycopy(dataStore, index + 1, dataStore, index, dataMov);
		dataStore[size--] = null;
		return removedValue;

	}

	// 4)contains method
	public boolean contains(Object o) {
		if (o == null) {
			for (int i = 0; i < size; i++) {
				if (dataStore[i] == null)
					return true;
			}
		} else {
			for (int i = 0; i < size; i++) {
				if (o.equals(dataStore[i]))
					return true;
			}
		}
		return false;
	}

	// 5)iterator Method
	public Iterator<E> iterator() {
		return new Itr();
	}

	// 5)implementing iterator
	private class Itr implements Iterator<E> {
		private int next;
		private int previous = -1;

		@Override
		public boolean hasNext() {
			return next != size;
		}

		@Override
		public E next() {
			int i = next;
			if (i >= size)
				throw new NoSuchElementException();
			Object[] listArray = MyArrayList.this.dataStore;
			next = i + 1;
			previous = i;
			return (E) listArray[previous];
		}

		@Override
		public void remove() {
			MyArrayList.this.remove(previous);
			next = previous;
			previous = -1;
		}

	}
	
	// 6)Printing list
	@Override
	public String toString() {

		Iterator<E> it = iterator();
		if (!it.hasNext())
			return "[]";

		StringBuilder sb = new StringBuilder();
		sb.append('[');
		while (it.hasNext()) {
			E e = it.next();
			sb.append(e).append(",");
		}
		sb.append("]");
		return sb.toString();
	}

}
