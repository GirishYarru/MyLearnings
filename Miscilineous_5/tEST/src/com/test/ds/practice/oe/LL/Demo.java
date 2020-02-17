package com.test.ds.practice.oe.LL;

public class Demo {

	public static void main(String[] args) {
		SingleLinkedList sLL = new SingleLinkedList();
		sLL.insertAtBegining(10);
		sLL.insertAtBegining(20);
		sLL.insertAtBegining(30);
		sLL.displayElements();
		
		sLL.insertAtEnd(40);
		sLL.displayElements();
		
		sLL.deleteNode(40);
		sLL.displayElements();



	}

}
