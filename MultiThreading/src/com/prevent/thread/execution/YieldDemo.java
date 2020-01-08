package com.prevent.thread.execution;

public class YieldDemo {
//yield -> Gives chance to other waiting thread of same priority. 
//Output will differ from one machine to other machine.
//Also output is not guranted
	// public static native void yield()
	public static void main(String[] args) {
		Yield yield = new Yield();
		yield.start();
		for (int i = 0; i < 5; i++) {
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + " in control");
		}

	}

}
