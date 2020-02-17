package com.dp.singleton;

public class MySingleTon {
	// Eager initialzation
	private static final MySingleTon instance = new MySingleTon();

	private MySingleTon() {

	}

	public static MySingleTon getInstance() {
		return instance;
	}
	
	public void printMessage() {
		System.out.println("*******in singleton class ****");
	}

}
