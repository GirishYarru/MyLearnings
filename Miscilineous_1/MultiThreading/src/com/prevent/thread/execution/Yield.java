package com.prevent.thread.execution;

public class Yield extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(Thread.currentThread().getName() + " in control");
		}
	}

}
