package com.test.ds.practice.oe.LL;

public class SingleLinkedList {
	Node start;

	SingleLinkedList() {
		start = null;
	}

	// insert at begining
	public void insertAtBegining(int data) {
		Node temp = new Node(data);
		if (start == null) {
			start = temp;
			return;
		}
		// Node p = start;
		temp.link = start;
		start = temp;

	}

	// 2)insert at end
	public void insertAtEnd(int data) {
		Node temp = new Node(data);
		if (start == null) {
			start = temp;
		}
		Node p = start;
		while (p.link != null) {
			p = p.link;
		}
		p.link = temp;

	}

	// 3)delete node from linked list
	public void deleteNode(int data) {
		if (start == null)
			return;
		if (start.link == null && start.info == data) {
			start = null;
		}
		Node p = start;
		while (p.link != null) {
			if (p.link.info == data) {
				break;
			}
			p = p.link;
		}
		if (p.link == null) {
			System.out.println("No elements found to delete");
		} else {
			p.link = p.link.link;
		}

	}

	public void displayElements() {
		Node p = start;
		if (start == null)
			return;
		System.out.println("Elements in list are: ");
		while (p != null) {
			System.out.println(p.info);
			p = p.link;
		}
	}
}
