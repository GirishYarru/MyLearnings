package com.synchronization.objectlevel;

public class Display {
	public  void printName(String name) {
		synchronized(Display.class) {
			for (int i = 0; i < 5; i++) {
				try {
					Thread.sleep(800);
				} catch (InterruptedException e) {
				}
				System.out.println(name);
			}
		}


	}

}
