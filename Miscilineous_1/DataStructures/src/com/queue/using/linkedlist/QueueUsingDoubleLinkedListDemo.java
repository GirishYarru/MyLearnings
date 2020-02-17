package com.queue.using.linkedlist;

public class QueueUsingDoubleLinkedListDemo {

	public static void main(String[] args) {
		QueueUsingDoubleLInkedList ll = new QueueUsingDoubleLInkedList();
		ll.enqueue(1);
		ll.enqueue(2);
		ll.enqueue(3);
		System.out.println(ll.deque());
		System.out.println(ll.deque());
		System.out.println(ll.deque());


		

	}

}
