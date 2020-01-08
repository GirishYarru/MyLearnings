package com.synchronization.classlevel;

public class Display {
	public static synchronized void printName(String name) {
		for (int i = 0; i < 5; i++) {
			System.out.println(name);
		}

	}

}
