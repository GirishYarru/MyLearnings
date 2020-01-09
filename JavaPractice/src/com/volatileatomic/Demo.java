package com.volatileatomic;

public class Demo extends Thread {
	static boolean flag = true;
	@Override
	public void run() {
		long count = 0;
		while(flag) {
			count++;
		}
		System.out.println("terminated"+count);
		
	}
	public static void main(String[] args) throws InterruptedException {
		Demo demo = new Demo();
//		demo.start();
		Runnable r = ()->{

			long count = 0;
			while(flag) {
				count++;
			}
			System.out.println("terminated"+count);
			
		
		};
		Thread t = new Thread(r);
		t.start();
		Thread.sleep(1000);
		Runnable r1 = ()->{
			flag = false;
		};
		Thread t2 = new Thread(r1);
		t2.start();
		System.out.println("after sleeping in main");
//
//		demo.flag = false;
//		System.out.println("deom flag ::" + demo.flag);

	}

}
