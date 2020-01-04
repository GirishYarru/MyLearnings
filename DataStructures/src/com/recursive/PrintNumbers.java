package com.recursive;

public class PrintNumbers {

	// Display numbers from 1 to n
	public static void print1(int n) {
		if (n == 0)
			return;
		print1(n - 1);
		System.out.println(n + " ");
	}

	// Display numbers from n to 1
	public static void print2(int n) {
		if (n == 0)
			return;
		System.out.println(n + " ");
		print2(n - 1);
	}

	public static void main(String[] args) {
		System.out.println("*** Display numbers from 1 to n ****");
		print1(5);
		System.out.println("*** Display numbers from n to 1 ****");
		print2(5);
	}

}
