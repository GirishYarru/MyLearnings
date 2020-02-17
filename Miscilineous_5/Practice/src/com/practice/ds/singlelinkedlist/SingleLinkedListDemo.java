package com.practice.ds.singlelinkedlist;

public class SingleLinkedListDemo {

	public static void main(String[] args) {
		SingleLinkedList list = new SingleLinkedList();
		
		System.out.println(" ----at begining ---");
		// 1)insert data at begining
		list.insertAtBegining(1);
		list.insertAtBegining(2);
		list.insertAtBegining(3);
		list.insertAtBegining(4);
		list.printData();
		//2) insert at end
		System.out.println(" ----at end ---");
		list.insertAtEnd(5);
		list.insertAtEnd(6);
		list.insertAtEnd(7);
		list.printData();
		//3) insert after node
		System.out.println("-----insert after Node-----");
		list.insertAfterNodes(8, 6);
		list.printData();
		//4) insert before node
		list.insertBeforeNode(9, 8);
		list.printData();

		


	}

}
