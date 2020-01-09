package com.abstractpractice.inheritance;

public class A {
	
	static int i = 100;
	
	static {
		i = i-- - --i;
		System.out.println("First " + i);
	}
	{
		i = i++ + ++i;
		System.out.println("Second " + i);
	}
}
