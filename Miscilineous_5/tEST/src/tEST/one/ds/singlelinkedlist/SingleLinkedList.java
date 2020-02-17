package tEST.one.ds.singlelinkedlist;

import java.util.ArrayList;
import java.util.List;

public class SingleLinkedList {
	private Node start;

	public SingleLinkedList() {
		start = null;
	}

	// traversing linked list
	public void displayList() {
		Node p = start;
		if (start == null) {
			System.out.println("List is empty");
			return;
		}
		System.out.println("Elements in list are : ");
		while (p != null) {
			System.out.println(p.info);
			p = p.link;

		}
	}

	// searching element in linked list
	public void searchList(int x) {
		int position = 1;
		Node p = start;
		while (p != null) {
			if (x == p.info) {
				break;
			}
			position++;
			p = p.link;

		}
		if (p == null) {
			System.out.println(x + " not found ");

		} else {
			System.out.println(x + " found at position : " + position);

		}

	}

	// inserting element at begining
	public void insertBegining(int data) {
		if (start == null) {
			start = new Node(data);
			return;
		}
		Node temp = new Node(data);
		temp.link = start;
		start = temp;
	}

	// inserting at end
	public void insertAtEnd(int data) {
		Node temp = new Node(data);
		if (start == null) {
			start = temp;
			return;
		}
		Node p = start;
		while (p.link != null) {
			p = p.link;
		}
		p.link = temp;

	}

	// count no.Of nodes
	public int countNoOfNodes() {
		Node p = start;
		int count = 0;
		while (p != null) {
			p = p.link;
			count++;

		}
		return count;

	}

	// reference to last node
	public void findLastNodeReference() {
		Node p = start;
		while (p.link != null) {
			p = p.link;
		}

		System.out.println(p.info);

	}

	// find second last node reference
	public void findSecondLastNodeRefernce() {
		Node p = start;
		while (p.link.link != null) {
			p = p.link;

		}
		System.out.println("second last node :: " + p.info);
	}

	// find node with particular info
	public void findNodeWithParticularInfo(int x) {
		Node p = start;
		while (p != null) {
			if (x == p.info) {
				break;
			}
			p = p.link;
		}
		if (p == null) {
			System.out.println(" node not found ");
		} else {
			System.out.println("** Node found *** ");
		}

	}

	// find reference to predecessor of node with particular info
	public void findPredecessorOfNode(int data) {
		Node p = start;
		int position = 1;
		while (p.link != null) {
			if (p.link.info == data) {
				System.out.println(" predecessor found at position: " + position + " with data " + p.info);

				break;
			}
			p = p.link;
			position++;

		}
	}

	// find reference to node at particular position
	public void findReferenceAtposition(int k) {
		Node p = start;
		for (int i = 1; i < k && p != null; i++) {
			p = p.link;
		}
		if (p != null) {
			System.out.println("info at position " + k + " is " + p.info);
		} else {
			System.out.println("empty node at position : " + k);
		}

	}

	// insert after a node
	public void insertAfterNode(int nodeData, int newNode) {
		Node p = start;
		while (p != null) {
			if (p.info == nodeData) {
				Node temp = new Node(newNode);
				temp.link = p.link;
				p.link = temp;
				System.out.println(" node inserted ");
				break;

			}
			p = p.link;

		}
		if (p == null) {
			System.out.println(nodeData + " node not found ");
		}
	}

	// insert before a node
	public void insertBeforeNode(int beforeNode, int newNode) {
		Node p = start;
		while (p.link != null) {
			if (p.link.info == beforeNode) {
				Node temp = new Node(newNode);
				temp.link = p.link;
				p.link = temp;
				System.out.println(" Node before inserted ");
				break;
			}
			p = p.link;
		}
		if (p == null) {
			System.out.println(" node " + beforeNode + " not found");
		}

	}

	// insert at given position
	public void insertAtGivenPosition(int k, int newNode) {
		Node p = start;
		int i;
		if (k == 1) {
			Node temp = new Node(newNode);
			temp.link = start;
			start = temp;
			return;

		}
		for (i = 1; i < k - 1 && p != null; i++) {
			p = p.link;

		}
		if (p == null) {
			System.out.println(" you can insert only upto " + i);
		} else {
			Node temp = new Node(newNode);
			temp.link = p.link;
			p.link = temp;
		}

	}

	// delete of first Node
	public void deleteFirstNode() {
		if (start == null) {
			return;
		}
		System.out.println(" deleted first node ");
		start = start.link;
	}

	// delete of the only node
	public void deleteOnlyNode() {
		start = null;
	}

	// delete between nodes
	public void deleteAtEnd() {
		if (start == null) {
			return;
		}
		if (start.link == null) {

			start = null;
		}
		Node p = start;
		while (p.link.link != null) {
			p = p.link;

		}
		p.link = null;

	}

	// delete a particular node with given data
	public void deleteNode(int data) {
		if (start == null) {
			return;
		}
		if (start.link == null) {
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
			System.out.println("Node " + data + " not found");
		} else {
			p.link = p.link.link;
		}

	}

	// Reverse linked list
	public void reverseLinkedList() {
		Node p, next, prev;
		prev = null;
		p = start;
		while (p != null) {
			next = p.link;
			p.link = prev;
			prev = p;
			p = next;

		}
		start = prev;
	}

	// bubble sort exchange data - revision
	public void bubbleSortExchangeData1() {
		Node p, q, end;
		end = null;
		// p = start;
		for (end = null; end != start.link; end = p) {
			for (p = start; p.link != end; p = p.link) {
				q = p.link;
				if (p.info > q.info) {
					int temp = p.info;
					p.info = q.info;
					q.info = temp;
				}

			}

		}
	}

	// //Bubble sort exchange links
	// public void

	// Bubble sort - exchange data
	public void bubbleSortExchangeData() {
		Node p, q, r, end, temp;
		for (end = null; end != start.link; end = p) {
			for (p = r = start; p.link != end; r = p, p = p.link) {
				q = p.link;
				if (p.info > q.info) {
					p.link = q.link;
					q.link = p;
					if (p != start) {
						r.link = q;
					} else {
						start = q;
					}

					temp = p;
					p = q;
					q = temp;

				}
			}
		}
	}

	// Merging two sorted linked lists
	// merge two sorted linked lists using new List
	public SingleLinkedList mergeCreatingNewList(SingleLinkedList list1, SingleLinkedList list2) {
		SingleLinkedList mergeList = new SingleLinkedList();
		mergeList.start = merge(list1.start, list2.start);
		return mergeList;

	}

	private Node merge(Node p1, Node p2) {
		Node startM;
		if (p1.info <= p2.info) {
			startM = new Node(p1.info);
			p1 = p1.link;
		} else {
			startM = new Node(p2.info);
			p2 = p2.link;
		}

		Node pM = startM;
		while (p1 != null && p2 != null) {
			if (p1.info <= p2.info) {
				pM.link = new Node(p1.info);
				p1 = p1.link;
			} else {
				pM.link = new Node(p2.info);
				p2 = p2.link;
			}
			pM = pM.link;

		}

		while (p1 != null) {
			pM.link = new Node(p1.info);
			p1 = p1.link;
			pM = pM.link;
		}

		while (p2 != null) {
			pM.link = new Node(p2.info);
			p2 = p2.link;
			pM = pM.link;
		}
		return startM;
	}

	// merge two sorted linked lists with out creating new list
	public SingleLinkedList mergeSortedLinkedLists(SingleLinkedList p1, SingleLinkedList p2) {
		SingleLinkedList sortedList = new SingleLinkedList();
		sortedList.start = merge1(p1.start, p2.start);
		return sortedList;

	}

	private Node merge1(Node p1, Node p2) {
		Node startPM;
		if (p1.info <= p2.info) {
			startPM = p1;
			p1 = p1.link;
		} else {
			startPM = p2;
			p2 = p2.link;
		}
		Node pM = startPM;
		while (p1 != null && p2 != null) {
			if (p1.info <= p2.info) {
				pM.link = p1;
				p1 = p1.link;
				pM = pM.link;

			} else {
				pM.link = p2;
				p2 = p2.link;
				pM = pM.link;

			}

		}

		if (p1 == null) {
			pM.link = p2;
		}
		if (p2 == null) {
			pM.link = p1;
		}
		return startPM;
	}

	public void exchangeLinks() {
		Node p, q, end, r, temp;
		for (end = null; end != start.link; end = p) {
			for (p = r = start; p.link != end; r = p, p = p.link) {
				q = p.link;
				if (p.info > q.info) {
					p.link = q.link;
					q.link = p;
					if (p != start)
						r.link = q;
					else
						start = q;
					temp = p;
					p = q;
					q = temp;

				}

			}
		}
	}

	// insert cycle at element x
	// link the last element found to given node data
	public void insertCycle(int x) {
		if (start == null)
			return;
		Node px = null;
		Node prev = null;
		Node p = start;
		while (p != null) {
			if (p.info == x) {
				px = p;
			}
			prev = p;
			p = p.link;

		}
		if (px != null) {
			prev.link = px;
		} else {
			System.out.println("Element x :" + x + "not found");
		}

	}

	// Detect cycle in list
	public boolean detectCycleInList() {
		if (findCycle() == null) {
			return false;
		} else {
			return true;
		}

	}

	private Node findCycle() {
		Node slow = start, fast = start;

		while (fast != null && fast.link != null) {
			slow = slow.link;
			fast = fast.link.link;
			if (slow == fast) {
				return slow;
			}

		}

		return null;

	}

	// Remove cycle in linked list
	// 1)Find no.of nodes in cycle
	// 2)Find no.of nodes not in cycle
	// 3)Add both for total length of nodes in list
	// 4 for the last node make link as null --> so cycle is removed
	public void removeCycle() {
		// find no.of nodes in cycle
		Node p = findCycle();
		Node q = findCycle();
		System.out.println("Both P and Q met each other at : " + p.info);
		int cycleCount = 0;
		int nonCycleCount = 0;
		int totalCount;
		// while (p != null) {
		// p = p.link;
		// cycleCount++;
		// if (p == q) {
		// break;
		// }
		// }
		do {
			q = q.link;
			cycleCount++;
		} while (p != q);
		p = start;
		System.out.println("cycle elements count is : " + cycleCount);
		while (p != q) {
			p = p.link;
			q = q.link;
			nonCycleCount++;
		}
		System.out.println("non cycle elements count is : " + nonCycleCount);
		totalCount = cycleCount + nonCycleCount;
		System.out.println("Total count is : " + totalCount);
		// removing cycle from list
		p = start;
		for (int i = 0; i < totalCount - 1; i++) {
			p = p.link;

		}
		p.link = null;
		System.out.println("last element in cycle is " + p.info);

	}

	// concatenate two linked list
	public void concatenateSingleLinkedList(SingleLinkedList list) {
		if (start == null) {
			start = list.start;
			return;
		}
		if (list.start == null) {
			return;
		}
		Node p = start;
		while (p.link != null) {
			p = p.link;
		}
		p.link = list.start;

	}

	public int printNthElementFromLast(int n) {
		if (start == null)
			return -1;
		Node main = start;
		Node ref = start;
		int count = 0;
		while (count < n) {
			if (ref == null) {
				System.out.println("could not find the position");
				return -1;
			}
			ref = ref.link;
			count++;

		}
		while (ref != null) {
			main = main.link;
			ref = ref.link;
		}
		System.out.println("last element is " + main.info);
		return main.info;
	}

	public int findMergeNode(SingleLinkedList head1, SingleLinkedList head2) {
		Node temp1 = head1.start;
		Node temp2 = head2.start;
		List<Node> list = new ArrayList<Node>();
		while (temp1 != null) {
			list.add(temp1);
			temp1 = temp1.link;
		}
		while (temp2 != null) {
			if (list.contains(temp2)) {
				break;
			}
			temp2 = temp2.link;
		}
		return temp2.info;

	}

}
