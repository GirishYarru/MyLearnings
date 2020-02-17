package tEST.one.multithreading.prevent.thread.execution;

public class Test extends Thread {
	@Override
	public void run() {
		Thread.yield();

		for (int i = 0; i < 10; i++) {
			

			System.out.println("in child thread " + i + " priority :: " + Thread.currentThread().getName());
		}
	}

}
