package com.recursive;

public class PowerOfNumber {

	public static int power(int number, int n) {
		if (n == 0)
			return 1;
		return number * power(number, n - 1);
	}

	public static void main(String[] args) {
		int result = power(2, 5);
		System.out.println(result);

	}

}
