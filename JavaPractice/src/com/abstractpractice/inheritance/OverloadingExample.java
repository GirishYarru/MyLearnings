package com.abstractpractice.inheritance;

public class OverloadingExample {
	public static void sum(int a,long b) {
		System.out.println(a+b+" 1");
	}
	
	public static void sum(int a,int b) {
		System.out.println(a+b+" 11");
	}
	
	public static void sum(long a,int b,long c) {
		System.out.println(a+b+" 2");
	}
	
	public static void main(String[] args) {
		sum(10,2);
	}

}
