package com.structural.dp.adapter;

public class GometryAdapter implements Shape {
	
	private GometricShape adaptee;
	
	public GometryAdapter(GometricShape adaptee) {
		this.adaptee = adaptee;
	}

	@Override
	public void draw() {
		adaptee.drawShape();
	}

	@Override
	public void resize() {
		System.out.println(">> resize is not allaowed");
	}

	@Override
	public String description() {
		return ">> This is gometry Shape";
	}

	@Override
	public boolean isHide() {
		return false;
	}

}
