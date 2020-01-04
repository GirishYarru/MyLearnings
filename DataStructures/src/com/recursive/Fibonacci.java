package com.recursive;

public class Fibonacci {
	
	public static void fibonacci(int num) {
		int t1 = 0;
		int t2 = 1;
		int sum =0;
		for(int i =0;i<num;i++) {
			System.out.print(t1+" ");
			sum = t1 +t2;
			t1 = t2;
			t2 = sum;
		}
		System.out.println();
		System.out.println(t1);
	}
	
	public static void main(String[] args) {
		 fibonacci(5);
	}

}
