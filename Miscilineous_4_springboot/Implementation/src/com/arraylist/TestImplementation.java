package com.arraylist;

import java.util.LinkedList;

public class TestImplementation implements Test {

	@Override
	public void message() {
		System.out.println("print");
	}

	public void display() {
		System.out.println("display");
	}
	
	public static void main(String[] args) {
		Test test = new TestImplementation();
		//test.d
		LinkedList l = new LinkedList<>();
		
	}

}
