package com.queue.using.linkedlist;

public class QueueUsingDoubleLInkedList {
	private Node front;
	private Node rear;

	QueueUsingDoubleLInkedList() {
		front = null;
		rear = null;
	}

	public void enqueue(int element) {
		Node temp = new Node(element);
		if (front == null)
			front = temp;
		else
			rear.link = temp;
		rear = temp;
	}

	public int deque() {
		if (front == null)
			throw new IllegalStateException("no elements to dequeue");
		int element = front.info;
		front = front.link;
		return element;
	}

	public int peek() {
		if (front == null)
			throw new IllegalStateException("no elements to dequeue");
		return front.info;
	}
}
