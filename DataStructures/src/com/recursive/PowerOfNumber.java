package com.recursive;

public class PowerOfNumber {

	public static int power(int number, int n) {
		if (n == 0)
			return 1;
		return number * power(number, n - 1);
	}

	public static void convertBase(int n, int base) {
		if (n == 0)
			return;
		convertBase(n / base, base);
		int remainder = n % base;
		if (remainder < 10)
			System.out.print(remainder);
		else
			System.out.print((char) (remainder - 10 + 'A'));
	}

	public static void main(String[] args) {
		int result = power(2, 5);
//		System.out.println(result);
//		System.out.println();
//		convertBase(123, 16);
		System.out.println((int)'A');
		System.out.print((char) (10 - 10 + 65));

	}

}
