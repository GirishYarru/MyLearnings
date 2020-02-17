package com.stack.using.queue;

import java.util.LinkedList;
import java.util.Queue;

public class StackUsingQueue {
	private int size;
	private Queue<Integer> queue1 = new LinkedList<>();
	private Queue<Integer> queue2 = new LinkedList<>();

	public StackUsingQueue() {
		size = 0;
	}

	public void push(int element) {
		queue2.add(element);
		while (!queue1.isEmpty()) {
			queue2.add(queue1.poll());
		}
		Queue<Integer> tempQueue = queue1;
		queue1 = queue2;
		queue2 = tempQueue;
		size++;
	}

	public int pop() {
		if (queue1.isEmpty())
			throw new NullPointerException();
		size--;
		return queue1.poll();

	}

	public int size() {
		return size;
	}

}
