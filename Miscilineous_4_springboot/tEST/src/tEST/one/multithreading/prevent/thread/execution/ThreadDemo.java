package tEST.one.multithreading.prevent.thread.execution;

public class ThreadDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Test test = new Test();
		test.start();


		for (int i = 0; i < 10; i++) {
			System.out.println("in main");

		}

	}

}
