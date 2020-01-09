package com.multilevelinheritance.practice;

public class ClassC extends ClassB{
	
	public void test() {
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		ClassC c = new ClassC();
	c.test();
	}

}
