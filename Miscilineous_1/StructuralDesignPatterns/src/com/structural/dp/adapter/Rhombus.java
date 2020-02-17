package com.structural.dp.adapter;

public class Rhombus implements GometricShape{
	private int diagonal1;
	private int diagonal2;
	
	Rhombus(int diagona11,int diagonal2){
		this.diagonal1 = diagona11;
		this.diagonal2 = diagonal2;
		
	}

	@Override
	public void drawShape() {
		System.out.println(">> drawing rhombus");
	}

	@Override
	public double area() {
		return diagonal1*diagonal2;
	}
	

}
