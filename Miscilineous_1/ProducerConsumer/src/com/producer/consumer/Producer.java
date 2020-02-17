package com.producer.consumer;

import java.util.Queue;
import java.util.Random;

public class Producer extends Thread {
	private Queue<Integer> sharedQueue = null;
	int maxSize;
	static int count = 0;

	public Producer(Queue<Integer> queue, int maxSize, String name) {
		super(name);
		this.sharedQueue = queue;
		this.maxSize = maxSize;
	}

	@Override
	public void run() {
		int i = 1;
		while (count <= 10) {
			synchronized (sharedQueue) {
				while (sharedQueue.size() == maxSize) {
					try {
						System.out.println("****** Queue full -> producer waiting for consumer to consume ***");
						sharedQueue.wait();

					} catch (Exception e) {
						System.out.println(e.getMessage());
					}
				}

				//Random random = new Random();
				// int i = random.nextInt();
				int value = i++;
				System.out.println("Producing value : " + value + " ***");
				sharedQueue.add(value);
				count++;
				sharedQueue.notifyAll();
			}

		}

	}

}
