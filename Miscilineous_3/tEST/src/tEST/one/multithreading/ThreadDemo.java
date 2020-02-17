package tEST.one.multithreading;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
//1)ways to implement thread		
		//using extends
//		Test t = new Test();
//		t.start();
		//Thread.sleep(2000);
		//t.stop();
		
		//using implementing thread
		TestRunnable runnable = new TestRunnable();
		Thread thread = new Thread(runnable);
		thread.setPriority(1);
		thread.run();
//2) Thread names by default main,Thread-0,Thread-1...etc
		Thread.currentThread().setName("girish");
		System.out.println(Thread.currentThread().getName());
//3)Thread priorities
		//range 1-10
		//Thread.MIN_PRIORITY = 1;
		//Thread.NORM_PRIORITY = 5;
		//Thread.MAX_PRIORITY = 10;
		//thread having highest priority will execute first
		Thread.currentThread().setPriority(1);
		Test t1 = new Test();
		t1.setPriority(8);
		System.out.println(" child priority "+t1.getPriority());
		t1.start();
		
		Test t2 = new Test();
		t2.setPriority(2);
		System.out.println(" child priority "+t2.getPriority());
		t2.start();
		System.out.println("--- in main --");
		
		

	}

}
