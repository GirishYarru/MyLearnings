package com.recursive;

public class BaseConversion {

	public static void toBinary(int n) {
		if (n == 0) {
			return;
		}
		toBinary(n / 2);
		System.out.print(n % 2 + " ");
	}

	public static void convertBase(int number, int base) {
		if (number == 0)
			return;
		convertBase(number / base, base);
		int remainder = number % base;
		if (remainder < 10)
			System.out.print(remainder + " ");
		else
			System.out.print((char) remainder - 10 + 'A');

	}

	public static void main(String[] args) {
		toBinary(4);
		
		System.out.println();

		convertBase(123, 8);
	}

}
