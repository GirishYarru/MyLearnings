package com.thread.priorities;

public class ChildThread extends Thread {
	public ChildThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());

		System.out.println("child thread priority:" + Thread.currentThread().getPriority());

		for (int i = 0; i < 10; i++) {

			System.out.println("Hello");
		}
	}

}
