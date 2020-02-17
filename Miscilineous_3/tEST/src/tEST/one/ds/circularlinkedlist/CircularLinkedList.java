package tEST.one.ds.circularlinkedlist;

public class CircularLinkedList {
	private Node last;

	public CircularLinkedList() {
		this.last = null;
	}

	// 1)display circular linked list
	public void displayCircularLinkedList() {
		// Node p = last;
		if(last == null) {
			System.out.println("No elements to display");
			return;
		}
		Node p = last.link;
		System.out.println("Elements in circular linked list are:");
		do {
			System.out.println(p.info);
			p = p.link;
		} while (p != last.link);
	}

	// Insertion in circular linked list
	// 2)Insert at begining of linked list
	public void insertAtBegining(int newNode) {
		Node temp = new Node(newNode);
		temp.link = last.link;
		last.link = temp;
	}

	// 3)Insertion into empty list
	public void insertIntoEmptyList(int newNode) {
		Node temp = new Node(newNode);
		last = temp;
		last.link = temp;
	}

	// 4) Insertion at end of circular linked list
	public void insertAtEndOflist(int newNode) {
		Node temp = new Node(newNode);
		temp.link = last.link;
		last.link = temp;
		last = temp;

	}

	// 5)Insertion in between Nodes
	// Insertion after a node
	public void insertAfterNode(int oldNode, int newNode) {
		Node p = last.link;
		do {
			if (p.info == oldNode) {
				break;
			}
			p = p.link;

		} while (p != last.link);
		if (p == last.link && p.info != newNode) {
			System.out.println("Can't be inserted as given element not found ");
		} else {
			Node temp = new Node(newNode);
			temp.link = p.link;
			p.link = temp;
			if (p == last) {
				last = temp;
			}

		}

	}

	// Deletion in circular linked list
	// 6) Deletion of the only node
	public void deleteOnlyNode() {
		last = null;
	}

	// 8)Delete first node in list
	public void deleteFirstNode() {
		if (last == null) {
			return;
		}
		if (last.link == last) {
			last = null;
			return;
		}
		last.link = last.link.link;
	}

	// 7)Delete of the end node in circular linked list
	public void deleteLastNode() {
		if (last == null) {
			return;
		}
		if (last.link == last) {
			last = null;
			return;
		}
		Node p = last.link;
		while (p.link != last) {
			p = p.link;

		}
		p.link = last.link;
		last = p;
	}

	// 8)delete Given Node
	public void deleteGivenNode(int node) {

		if (last == null) {
			return;
		}
		if (last.link == last && last.info == node) {
			last = null;
			return;
		}
		if (last.link.info == node) {
			last.link = last.link.link;
			return;
		}

		Node p = last.link;
		while (p.link != last.link) {
			if (p.link.info == node) {
				break;
			}

			p = p.link;
		}
		if (p.link == last.link) {
			System.out.println("Element not found");
		} else {
			p.link = p.link.link;
			if (last.info == node) {
				last = p;
			}
		}
	}

	//9) concatenation of two circular linked lists
	public void concatenate(CircularLinkedList list) {
		Node p =last.link;
		System.out.println(p.info + " **");
		System.out.println(list.last.link.info+ " last .link --> first");
		last.link = list.last.link;
		list.last.link = p;
		
	}
	
}
