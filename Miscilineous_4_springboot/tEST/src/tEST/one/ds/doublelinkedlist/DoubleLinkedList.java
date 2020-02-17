package tEST.one.ds.doublelinkedlist;

public class DoubleLinkedList {
	Node start;

	public DoubleLinkedList() {
		this.start = null;
	}

	// 1)insert into empty list

	public void insertNodeInEmptyList(int data) {
		Node p = new Node(data);
		start = p;
	}

	// 2)Insert at begining of node
	public void insertNodeAtBegining(int data) {
		if (start == null) {
			insertNodeInEmptyList(data);
			return;
		}
		Node temp = new Node(data);
		temp.next = start;
		start.prev = temp;
		start = temp;

	}

	// 3)Insert at end of node
	public void insertAtEnd(int data) {
		Node p = start;
		Node temp = new Node(data);
		if (start == null) {
			start = temp;
			return;
		}
		while (p.next != null) {
			p = p.next;
		}
		p.next = temp;
		temp.prev = p;
	}

	// 4) Display double linked list
	public void displayDoublyLinkedList() {
		if (start == null) {
			System.out.println(" No elements found in doubly linked list ");
			return;
		}
		System.out.println("Elements in doubly linked list are :");
		Node p = start;
		while (p != null) {
			System.out.println(p.info);
			p = p.next;
		}
	}

	// 5)Insert between the nodes
	// 5.1)Insert after a node at given Node
	public void insertAfterNode(int oldNode, int data) {
		Node temp = new Node(data);
		Node p = start;
		while (p != null) {
			if (p.info == oldNode) {
				temp.next = p.next;
				temp.prev = p;
				if (p.next != null) {
					p.next.prev = temp;
				}
				p.next = temp;
				break;

			}
			p = p.next;
		}
		if (p == null) {
			System.out.println("Given node : " + oldNode + " not found in list");
		}
	}

	// 6)insert node before node
	public void insertBeforeNode(int oldNode, int newNode) {
		if (start == null) {
			System.out.println(" No elements in list");
			return;
		}
		Node temp = new Node(newNode);
		if (start.info == oldNode) {
			temp.next = start;
			start.prev = temp;
			start = temp;
			return;

		}
		Node p = start;
		while (p != null) {
			if (p.info == oldNode) {
				temp.next = p;
				temp.prev = p.prev;
				p.prev.next = temp;
				p.prev = temp;
				break;
			}
			p = p.next;

		}
		if (p == null) {
			System.out.println("Element not found in list");
		}

	}

	// Deletion in doubly linked list
	// 1)deletion of first node
	public void deleteFirstNode() {
		if (start == null) {
			System.out.println("Can't delete the first element as list is empty");
			return;
		}
		if (start.next == null) {
			start = null;
			return;
		}

		start = start.next;
		start.prev = null;

	}

	// 2)Deletion of the only node
	public void deletionOfOnlyNode() {
		start = null;
	}

	// 3)Deletion in between the list
	public void deleteNodeInList(int node) {
		if (start == null) {
			return;
		}
		if (start.next == null) {
			if (start.info == node) {
				start = null;
			} else {
				System.out.println("Given element not found : " + node);
			}
			return;
		}
		if (start.info == node) {
			start = start.next;
			start.prev = null;
			return;
		}
		// Node p = start;
		// while (p != null) {
		// if (p.info == node) {
		// p.prev.next = p.next;
		// p.next.prev = p.prev;
		// System.out.println("Deleted the given node from list : " + node);
		// break;
		// }
		// p = p.next;
		//
		// }
		// if (p == null) {
		// System.out.println("Element not found in list ");
		// }

		Node p = start.next;
		while (p.next != null) {
			if (p.info == node)
				break;
			p = p.next;
		}
		if (p.next != null) {
			// Node to be deleted is in between
			p.prev.next = p.next;
			p.next.prev = p.prev;
		} else {
			// p refers to last node
			if (p.info == node) {
				p.prev.next = null;
			} else {
				System.out.println("No element found");
			}
		}

	}

	// 4)Deletion of last node
	public void deleteLastNode() {
		if (start == null) {
			System.out.println("No elements found in list ");
			return;
		}
		if (start.next == null) {
			// only one node in list
			start = null;
			return;
		}
		Node p = start;
		while (p.next != null) {
			p = p.next;
		}

		p.prev.next = null;
		System.out.println("Last element deleted");
	}

	// Reversing doubly linked list
	public void reverseDoublyLinkedList() {
		if(start == null) {
			return;
		}
		Node p1 = start;
		Node p2 = p1.next;
		p1.next = null;
		p1.prev = p2;
		while (p2 != null) {
			p2.prev = p2.next;
			p2.next = p1;
			p1 = p2;
			p2 = p2.prev;

		}

		start = p1;
	}

}
