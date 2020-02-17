package com.prevent.thread.execution;

public class Sleep extends Thread {
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			throw new RuntimeException();
		}

		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread - sleeping");

		}
	}

}
