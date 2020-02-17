package com.volatiletest;

public class VolatileIntegerTest {

	volatile static int number = 1;

	public static void main(String[] args) throws InterruptedException {
		Runnable r1 = () -> {
			for (int i = 0; i < 5; i++) {
				number++;
				System.out.println("thread2::" + number);
			}
		};
		Thread t1 = new Thread(r1);
		t1.start();

		Runnable r2 = () -> {
			for (int i = 0; i < 5; i++) {
				number++;
				System.out.println("thread1::" + number);
			}
		};
		Thread t2 = new Thread(r2);
		t2.start();
	}
//Output is not constant and some times numer may be missed or duplicated, here 4
/*	thread2::2
	thread2::4
	thread2::5
	thread2::6
	thread2::7
	thread1::4
	thread1::8
	thread1::9
	thread1::10
	thread1::11*/


}
