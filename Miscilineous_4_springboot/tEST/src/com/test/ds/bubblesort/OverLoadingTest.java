package com.test.ds.bubblesort;

public class OverLoadingTest {
	
	public static void method(Integer o) {
		System.out.println("in obj");
	}
	public static void method(String o) {
		System.out.println("in str");
	}
	
	public static void main(String[] args) {
		method(2);
	}
}
