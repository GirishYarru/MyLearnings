package com.java8.interfaces;

public class CalculatorImpl implements Calc, AdvancedCalc {

	public int add(int a, int b) {
		return a + b;
	}

	@Override
	public int multiplication(int a, int b) {
		System.out.println("in Class :: Multiply");
		return a * b;
	}

}
