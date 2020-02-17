package com.stack.using.linkedlist;

public class StackUsingLinkedList {
	private Node start;

	public StackUsingLinkedList() {
		start = null;
	}

	public void push(int element) {
		Node temp = new Node(element);
		temp.link = start;
		start = temp;
	}

	public int pop() {
		if (isEmpty())
			throw new IllegalStateException("Stack underflow");
		int temp = start.info;
		start = start.link;
		return temp;
	}

	public boolean isEmpty() {
		return start == null;
	}

}
