package com.recursive;

public class TestContinue {
	public static void iterateLoop() {
		for (int i = 1; i <= 3; i++) {
			if (i == 2) {
				continue;
			}
			System.out.println(i + " ");
		}
	}

	public static boolean checkPrime(int num) {
		boolean flag = true;
		if (num == 1)
			return true;
		if (num == 0)
			return false;
		for (int i = 2; i <= num -1 ; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;

	}

	public static void main(String[] args) {
		boolean isPrime = checkPrime(3);
		System.out.println(isPrime);
	}

}
