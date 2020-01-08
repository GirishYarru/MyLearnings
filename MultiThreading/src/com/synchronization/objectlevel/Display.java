package com.synchronization.objectlevel;

public class Display {
	public synchronized void printName(String name) {
		for (int i = 0; i < 5; i++) {
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}

	}

}
