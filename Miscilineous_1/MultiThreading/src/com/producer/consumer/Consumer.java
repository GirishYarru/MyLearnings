package com.producer.consumer;

import java.util.Queue;

public class Consumer extends Thread {
	private Queue<Integer> sharedQueue;
	private int minSize = 0;
	int count = 0;

	public Consumer(Queue<Integer> queue) {
		this.sharedQueue = queue;
	}

	@Override
	public void run() {
		while (count < 10) {
			synchronized (sharedQueue) {
				while (sharedQueue.size() == minSize) {

					try {
						sharedQueue.wait();
					} catch (InterruptedException e) {
					}
				}
				int consumedElement = sharedQueue.poll();
				System.out.println("Consumed :: " + consumedElement);
				sharedQueue.notifyAll();
				count++;
			}

		}

	}

}
