package com.volatiletest;

public class VolatilebooleanDemo {
	static boolean flag = true;
	//volatile static boolean flag = true; //with volatile

	public static void main(String[] args) throws InterruptedException {
		
		Runnable r1 = () -> {
			while (flag) {
				// do some operations
			}
			System.out.println("Thread terminated");
		};

		Thread t1 = new Thread(r1);
		t1.start();
		Thread.sleep(1000);

		// thread2 which modifies flag to false
		Runnable r2 = () -> {
			flag = false;
		};
		Thread t2 = new Thread(r2);
		t2.start();

		System.out.println("Main thread completed execution");

	}

}
