package com.java8.interfaces;

public interface Calc {
	int add(int a, int b);

	default int multiplication(int a, int b) {
		return a * b;
	}

	static int subtraction(int a, int b) {
		return a - b;
	}
	
	static int division(int a, int b) {
		return a/b;
	}
}
