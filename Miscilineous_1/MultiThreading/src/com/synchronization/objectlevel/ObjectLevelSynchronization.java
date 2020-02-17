package com.synchronization.objectlevel;

public class ObjectLevelSynchronization extends Thread {
	private Display display;
	private String name;

	public ObjectLevelSynchronization(Display d, String name) {
		this.display = d;
		this.name = name;
	}

	@Override
	public void run() {
		display.printName(name);
		
	}

}
