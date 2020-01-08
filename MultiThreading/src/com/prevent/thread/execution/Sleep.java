package com.prevent.thread.execution;

public class Sleep extends Thread {
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread - sleeping");
            try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted");
			}
		}
	}

}
