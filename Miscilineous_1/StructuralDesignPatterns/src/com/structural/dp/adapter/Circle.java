package com.structural.dp.adapter;

public class Circle implements Shape{

	@Override
	public void draw() {
		System.out.println(">> drawing circle");
		
	}

	@Override
	public void resize() {
		System.out.println(">> resizing circle");
	}

	@Override
	public String description() {
		return ">> circle object";
	}

	@Override
	public boolean isHide() {
		return false;
		
	}

}
