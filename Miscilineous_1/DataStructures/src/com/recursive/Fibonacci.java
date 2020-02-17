package com.recursive;

public class Fibonacci {

	public static void fibonacci(int num) {
		int t1 = 0;
		int t2 = 1;
		int sum = 0;
		for (int i = 0; i < num; i++) {
			System.out.print(t1 + " ");
			sum = t1 + t2;
			t1 = t2;
			t2 = sum;
		}
		System.out.println();
		System.out.println(t1);
	}

	public static int fibonacciRecursion(int num) {
		if (num == 0)
			return 0;
		if (num == 1)
			return 1;
		return fibonacciRecursion(num - 1) + fibonacciRecursion(num - 2);

	}

	public static void main(String[] args) {
//		fibonacci(5);
//		int result = fibonacciRecursion(1);
//		System.out.println(result);
		String s = "abc";
		System.out.println((s!=null)&(s.length()>0));

//		if((s!=null)|(s.length()>0))
//				System.out.println("&");
//		if((s!=null)&&(s.length()>0))
//				System.out.println("&&");
//		if((s==null)|(s.length()>0))
//			System.out.println("|");
//		if((s==null)||(s.length()>0))
//			System.out.println("||");
		
	}

}
