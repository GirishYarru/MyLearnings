package com.thread.priorities;

public class ThreadPriority {

	public static void main(String[] args) {

//System.out.println(Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(7);
		System.out.println(Thread.currentThread().getName());
		ChildThread ct = new ChildThread("harish child");

		ct.start();
//		ct.start();
		for (int i = 1; i <= 6; i++) {

			System.out.println("End of main method");
		}

	}
}
