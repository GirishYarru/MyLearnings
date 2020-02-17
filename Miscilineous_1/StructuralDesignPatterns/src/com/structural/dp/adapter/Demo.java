package com.structural.dp.adapter;

public class Demo {
	public static void main(String[] args) {
		Shape circle = new Circle();
		circle.draw();
		
		Shape rhombus = new GometryAdapter(new Rhombus(2, 2));
		rhombus.draw();
		
	}

}
