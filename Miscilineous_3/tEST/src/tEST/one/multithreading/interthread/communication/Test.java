package tEST.one.multithreading.interthread.communication;

public class Test extends Thread {
	@Override
	public void run() {
		synchronized (this) {
			int sum = 0;
			for (int i = 1; i <= 10; i++) {
				sum = sum + i;

			}

			this.notify();
			System.out.println(sum);


		}
	}

}
