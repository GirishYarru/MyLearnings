package com.abstractpractice.inheritance;

public class ReverseArray {

	public static char[] reverseArray(char[] array) {
		for (int i = 0, j = array.length - 1; i < array.length / 2 && j >= array.length / 2; i++, j--) {
			if ((Character.isDigit(array[i]) || Character.isLetter(array[i]))
					&& (Character.isDigit(array[j]) || Character.isLetter(array[j]))) {
				char temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			} else if (!(Character.isDigit(array[i]) || Character.isLetter(array[i]))
					&& !(Character.isDigit(array[j]) || Character.isLetter(array[j]))) {
				// do Nothing
			}

			else if (!Character.isDigit(array[i]) && !Character.isLetter(array[i])) {
				j = j + 1;
			} else if (!Character.isDigit(array[j]) && !Character.isLetter(array[j])) {
				i = i - 1;
			}

		}
		return array;
	}

	public static void main(String[] args) {
		char[] ch = { '1', '@', '$', '3', '4', '5', '#', '6' };
		char[] result = reverseArray(ch);
		for (char c : result) {
			System.out.print(c + " ");
		}

	}
}
