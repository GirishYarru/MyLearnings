package com.practice.ds.singlelinkedlist;

public class SingleLinkedList {
	private Node start;

	public SingleLinkedList() {
		this.start = null;
	}

	// 1) insert at begining
	public void insertAtBegining(int data) {
		if (start == null) {
			Node temp = new Node(data);
			start = temp;
			return;
		}
		Node temp = new Node(data);
		temp.link = start;
		start = temp;

	}

	// insert at end
	public void insertAtEnd(int data) {
		if (start == null) {
			start = new Node(data);
			return;
		}
		Node temp = new Node(data);
		Node p = start;
		while (p.link != null) {
			p = p.link;
		}

		p.link = temp;

	}

	// 3)insert between nodes
	public void insertAfterNodes(int newNode, int afterNode) {
		Node temp = new Node(newNode);
		if (start == null) {
			start = temp;
		}
		Node p = start;
		while (p != null) {
			if (p.link != null && p.link.info == afterNode) {
				temp.link = p.link.link;
				p.link.link = temp;
				break;
			}
			p = p.link;

		}
		if (p == null) {
			System.out.println(" Given after node not found");
		} else {
			System.out.println(" New node inserted ");
		}

	}

	// 4)insert before node
	public void insertBeforeNode(int newNode, int beforeNode) {
		if (start == null) {
			start = new Node(newNode);
			return;
		}
		Node p = start;
		Node temp = new Node(newNode);
		while (p != null) {
			if (p.link != null && p.link.info == beforeNode) {
				temp.link = p.link;
				p.link = temp;
				break;

			}
			p = p.link;

		}
		if (p == null) {
			System.out.println("Given before node not found");
		} else {
			System.out.println(" New node inserted ");
		}

	}

	// 5)insert at given position
	public void insertAtGivenPosition(int k, int newNode) {
		if (start == null) {
			System.out.println(" list is empty, given position not found ");
			return;
		}
		int index = 0;
		Node p = start;
		while (p != null && p.link != null && index + 1 == k) {
			if (index == k) {

				break;
			}
			p = p.link;
			index++;

		}

	}

	public void printData() {
		Node p = start;
		while (p != null) {
			System.out.println(p.info);
			p = p.link;
		}
	}

}
