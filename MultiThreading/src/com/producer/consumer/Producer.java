package com.producer.consumer;

import java.util.Queue;

public class Producer extends Thread {
	private Queue<Integer> sharedQueue;
	int maxSize = 5;
	int count = 0;

	public Producer(Queue<Integer> queue) {
		this.sharedQueue = queue;
	}

	@Override
	public void run() {

		int value = 0;
		while (count < 10) {
			synchronized (sharedQueue) {
				while (sharedQueue.size() == maxSize) {
					try {
						sharedQueue.wait();
					} catch (InterruptedException e) {
					}
				}
				value = value + 1;
				System.out.println("Produced::" + value);
				sharedQueue.add(value);
				sharedQueue.notifyAll();
				count++;
			}

		}

	}

}
