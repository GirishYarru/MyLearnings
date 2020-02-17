package tEST.one.ds.circularlinkedlist;

public class CircularLinkedListDemo {

	public static void main(String[] args) {
		CircularLinkedList cLL = new CircularLinkedList();
		System.out.println("***** 1)Insertion into empty circular list *****");
		cLL.insertIntoEmptyList(10);
		cLL.displayCircularLinkedList();
		System.out.println("***** 2)Insertion at begining of  circular list *****");
		cLL.insertAtBegining(20);
		cLL.displayCircularLinkedList();
		System.out.println("***** 3)Insertion at End of  circular list *****");
		cLL.insertAtEndOflist(30);
		cLL.displayCircularLinkedList();
		System.out.println("***** 4)Insertion after a given node in circular list *****");
		cLL.insertAfterNode(10, 40);
		cLL.displayCircularLinkedList();
		System.out.println("***** Deletion in circular list *****");
		CircularLinkedList cLL1 = new CircularLinkedList();
		cLL1.insertIntoEmptyList(10);
		cLL1.insertAtEndOflist(20);
		cLL1.insertAtEndOflist(30);
		cLL1.insertAtEndOflist(40);
		System.out.println("***** 5)Deletion at a given node in circular list *****");
		cLL1.deleteGivenNode(30);
		cLL1.displayCircularLinkedList();
		System.out.println("***** 6)Deletion of first node in circular list *****");
		cLL1.deleteFirstNode();
		cLL1.displayCircularLinkedList();
		System.out.println("***** 7)Deletion of last node in circular list *****");
		cLL1.deleteLastNode();
		cLL1.displayCircularLinkedList();
		System.out.println("***** 8)Deletion of only node in circular list *****");
		cLL1.deleteOnlyNode();
		cLL1.displayCircularLinkedList();
		System.out.println("*******9)concatenate two circular linked lists ");
		CircularLinkedList cLL2 = new CircularLinkedList();
		cLL2.insertIntoEmptyList(10);
		cLL2.insertAtEndOflist(20);
		cLL2.insertAtEndOflist(30);
		cLL2.insertAtEndOflist(40);
		cLL2.insertAtEndOflist(50);
		cLL2.displayCircularLinkedList();
		CircularLinkedList cLL3 = new CircularLinkedList();
		cLL3.insertIntoEmptyList(60);
		cLL3.insertAtEndOflist(70);
		cLL3.insertAtEndOflist(80);
		cLL3.insertAtEndOflist(90);
		cLL3.insertAtEndOflist(100);
		cLL3.displayCircularLinkedList();
		cLL2.concatenate(cLL3);
		cLL2.displayCircularLinkedList();

	}

}
