package com.producer.consumer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Demo {
	public static void main(String[] args) {
		
		Queue<Integer> sharedQueue = new LinkedList<>();
		Producer producer = new Producer(sharedQueue, 5, "Producer");
		Consumer consumer = new Consumer(sharedQueue, 5, "Consumer");
		producer.start();
		consumer.start();
		
		
	}

}
