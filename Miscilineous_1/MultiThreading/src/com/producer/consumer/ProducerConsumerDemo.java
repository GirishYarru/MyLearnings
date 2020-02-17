package com.producer.consumer;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumerDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();
		Producer producer = new Producer(queue);
		Consumer consumer = new Consumer(queue);
		consumer.start();
		producer.start();

	}

}
