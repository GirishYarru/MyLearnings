package com.abstractpractice;

public class TestImpl extends Test{

	@Override
	void test() {
		System.out.println("in test");
	}
	
	public static void main(String[] args) {
		Test test = new TestImpl();
		test.test();
	}
	

}
