package com.recursive;

public class Gcd {
	public static int findGCD(int a, int b) {
		if (b == 0)
			return a;
		return findGCD(b, a % b);
	}

	public static void main(String[] args) {
		int result = findGCD(36, 22);
		System.out.println(result);
	}

}
