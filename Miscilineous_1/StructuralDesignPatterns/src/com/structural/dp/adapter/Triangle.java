package com.structural.dp.adapter;

public class Triangle implements GometricShape{
	private static double  pi = 3.14;
	private int radius;
	
	public Triangle(int radius) {
		this.radius = radius;
	}

	@Override
	public void drawShape() {
		System.out.println(">> drawing Triangle");
		
	}

	@Override
	public double area() {
		return pi*radius*radius;
	}

}
