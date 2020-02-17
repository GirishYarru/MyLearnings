package com.volatileatomic;

public class VolatileAndAtomicDemo1 extends Thread {
	boolean flag = true;

	@Override
	public void run() {
		long count = 0;
		while (flag) {
			count++;
		}

		System.out.println("Terminated " + count);
	}
	
	public static void main(String[] args) throws InterruptedException {
		VolatileAndAtomicDemo1 demo = new VolatileAndAtomicDemo1();
		demo.start();
		Thread.sleep(1000);
		demo.flag = true;
		System.out.println("set to false");
	}

}
