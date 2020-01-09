package com.abstractpractice.inheritance;

public class ReverseArray {
	
	public static char[] reverseArray(char[] array) {
		for (int i = 0, j = array.length - 1; i < array.length / 2 && j >= array.length / 2; i++, j--) {
			if ((Character.isDigit(array[i]) || Character.isLetter(array[i]))
					&& (Character.isDigit(array[array.length - 1 - i])
							|| Character.isLetter(array[array.length - 1 - i]))) {
				char temp = array[i];
				array[i] = array[array.length - 1 - i];
				array[array.length - 1 - i] = temp;
			} else if(!(Character.isDigit(array[i]) || Character.isLetter(array[i]))
					&& !(Character.isDigit(array[array.length - 1 - i])
							|| Character.isLetter(array[array.length - 1 - i]))) {
				//do Nothing
			}
			
			else if (Character.isDigit(array[i]) && !Character.isLetter(array[i])) {
				i = i - 1;
			} else if (!Character.isDigit(array[array.length - 1 - i])
					&& !Character.isLetter(array[array.length - 1 - i])) {
				j = j + 1;
			}

		}
		return array;
	}

	public static void main(String[] args) {
		char[] ch = { '1', '@', '$', '3', '4', '5', '#', '6' };
		char[] result = reverseArray(ch);
		for (char c : result) {
			System.out.print(c+" ");
		}

	}
}
