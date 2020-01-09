package com.abstractpractice.inheritance;

public class B extends A {

	static {
		i = --i - i--;
		System.out.println("Third " + i);
	}
	{
		i = ++i + i++;
		System.out.println("Fourth " + i);
	}

}
