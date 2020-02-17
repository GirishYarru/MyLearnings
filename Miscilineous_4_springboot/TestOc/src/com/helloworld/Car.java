package com.helloworld;

public class Car {
	private Engine[] engines;

	public Engine[] getEngines() {
		return engines;
	}

	public Car(Engine[] engines) {
		super();
		this.engines = engines;
	}

	public void setEngines(Engine[] engines) {
		this.engines = engines;
	}
	
	public void printEngines() {
		for(Engine e : engines){
			System.out.println(e.getModel());
		}
		
	}

}
