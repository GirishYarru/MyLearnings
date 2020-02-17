package tEST.one.ds.doublelinkedlist;

public class Demo {

	public static void main(String[] args) {
		DoubleLinkedList dLL = new DoubleLinkedList();
		// 1)Insert node into empty list
		System.out.println("1)----------Insert node in empty list-----");
		dLL.insertNodeInEmptyList(20);
		// 2)Insert Node in begining
		System.out.println("2)----------Insert node in begining -------");
		dLL.insertNodeAtBegining(10);
		// 3)Display doubly linked list
		System.out.println("3)----------Display linked list -------");
		dLL.displayDoublyLinkedList();
		System.out.println("4)----------Insert node at end -------");
		dLL.insertAtEnd(40);
		dLL.displayDoublyLinkedList();
		System.out.println("5)----------Insert after node  --------");
		dLL.insertAfterNode(20, 30);
		dLL.displayDoublyLinkedList();
		System.out.println("6)----------Insert before node ---------");
		dLL.insertBeforeNode(30, 70);
		dLL.displayDoublyLinkedList();
		System.out.println("------------Deletion in doubly linked list ------");
		System.out.println("7)----------Deletion of first node ---------");
		dLL.deleteFirstNode();
		dLL.displayDoublyLinkedList();
		System.out.println("8)----------Deletion of last node ---------");
		dLL.deleteLastNode();
		dLL.displayDoublyLinkedList();
		System.out.println("9)----------Deletion of given node ---------");
		dLL.deleteNodeInList(30);
		dLL.displayDoublyLinkedList();
	//	System.out.println("10)----------Deletion of only node ---------");
	//	dLL.deletionOfOnlyNode();
	//	dLL.displayDoublyLinkedList();
		
		System.out.println("10)---------------Reverse doubly linked list---");
		dLL.reverseDoublyLinkedList();
		dLL.displayDoublyLinkedList();





		




		


	}

}
