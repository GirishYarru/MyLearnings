package com.producer.consumer;

import java.util.Queue;

public class Consumer extends Thread {
	private Queue<Integer> sharedQueue;
	private int maxSize;
	private String name;
	static int count = 0;

	public Consumer(Queue<Integer> sharedQueue, int maxSize, String name) {
		this.sharedQueue = sharedQueue;
		this.maxSize = maxSize;
		this.name = name;

	}

	@Override
	public void run() {
		while (count <= 10) {
			synchronized (sharedQueue) {
				while (sharedQueue.size() == 0) {
					try {
						System.out.println("-------Queue is empty consumer waiting for producer to produce -----");
						sharedQueue.wait();
					} catch (Exception e) {
						System.out.println(e.getMessage());

					}
				}
				System.out.println("-----consmed value ---- " + sharedQueue.poll() + " ____");
				count++;
				sharedQueue.notifyAll();

			}
		}
	}

}
