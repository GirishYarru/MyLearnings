package com.recursive;

public class SumOfDigits {

	public static int sumOfDigits(int n) {
		// base condition
		if (n / 10 == 0)
			return n;
		return sumOfDigits(n / 10) + n % 10;

	}

	public static void main(String[] args) {
		int result = sumOfDigits(2658);
		System.out.println(result);
	}

}
