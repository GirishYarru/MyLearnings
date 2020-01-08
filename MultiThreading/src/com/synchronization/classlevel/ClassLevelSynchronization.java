package com.synchronization.classlevel;

public class ClassLevelSynchronization extends Thread {
	private Display display;
	private String name;

	public ClassLevelSynchronization(Display d, String name) {
		this.display = d;
		this.name = name;
	}

	@Override
	public void run() {
		display.printName(name);
		
	}

}
