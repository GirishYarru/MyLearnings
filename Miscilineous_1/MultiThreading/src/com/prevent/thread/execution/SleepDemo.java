package com.prevent.thread.execution;

public class SleepDemo {
	// if thread doesn't want to perform any execution for a particular period of
	// time.
	// public static native void sleep(long ms)
	// public static native void sleep(long ms,long ns)
	// throws interrupted exception
	// Thread can be interrupted only when it is in sleeping state or waiting state

	public static void main(String[] args) {
		Sleep t = new Sleep();
		t.start();
		t.interrupt();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main Thread");
		}

	}

}
