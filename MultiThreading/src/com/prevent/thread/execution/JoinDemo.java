package com.prevent.thread.execution;

public class JoinDemo {
	// Join -> Always wait till the other thread completes its execution
	// public final void join()
	// throws interrupted exception

	public static void main(String[] args) throws InterruptedException {
		Join demoJoin = new Join();
		demoJoin.start();
		demoJoin.join();

		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}

	}

}
