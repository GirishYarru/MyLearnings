package tEST.one.ds.singlelinkedlist;

public class Demo {

	public static void main(String[] args) {
		SingleLinkedList sLList = new SingleLinkedList();
		System.out.println("1)**********insert elements at begining****");
		sLList.insertBegining(1);
		sLList.insertBegining(2);
		sLList.insertBegining(3);
		sLList.insertBegining(4);
		sLList.insertBegining(5);

		System.out.println("2)**********travesrse through linked list****");
		sLList.displayList();
//
//		System.out.println("3)**********search in linked list****");
//		sLList.searchList(13);
//
//		System.out.println("4)**********count size in linkedlist****");
//		int size = sLList.countNoOfNodes();
//		System.out.println("size is " + size);
//
//		System.out.println("5)**********count size in linkedlist****");
//		sLList.findLastNodeReference();
//
//		System.out.println("6)**********find second last node in linkedlist****");
//		sLList.findSecondLastNodeRefernce();
//
//		System.out.println("7)**********find node with particular ****");
//		sLList.findNodeWithParticularInfo(5);
//
//		System.out.println("8)********** insert at end ****");
//		sLList.insertAtEnd(13);
//		sLList.displayList();
//		sLList.findPredecessorOfNode(13);
//		System.out.println("9)*****find reference at position ***");
//		sLList.findReferenceAtposition(10);
//		System.out.println("10)***** insert after node ***");
//		// sLList = new SingleLinkedList();
//		sLList.insertAfterNode(2, 20);
//		sLList.displayList();
//		System.out.println("11)*****insert before node ***");
//		sLList.insertBeforeNode(20, 21);
//		sLList.displayList();
//		System.out.println("------");
//		System.out.println("12)*****insert given position node ***");
//		sLList.insertAtGivenPosition(4, 45);
//		sLList.displayList();
//
//		// --------------deleting first node ----
//		System.out.println("13)***** delete first node ***");
//		sLList.deleteFirstNode();
//		sLList.displayList();
//		// --------------deleting last node ----
//		System.out.println("13)***** delete last  node ***");
//		sLList.deleteAtEnd();
//		sLList.displayList();
//		// ---------deleting specific node with data
//		System.out.println("14)***** delete node with data 45 ***");
//		sLList.deleteNode(45);
//		sLList.displayList();
//
//		// ----------------Reversing single linked list -----
//		System.out.println("***** reversing linked list ******");
//		sLList.reverseLinkedList();
//		sLList.displayList();
//
//		// --------------Bubble sort--------------
//		System.out.println("------ Bubble Sort - Exchange Data -----------");
//		sLList.bubbleSortExchangeData();
//		sLList.displayList();
//
//		System.out.println("------Bubble Sort - Exchange Links -----------");
//		sLList.bubbleSortExchangeData();
//		sLList.displayList();
//
//		System.out.println("Merge two sorted single linked lists");
//		SingleLinkedList list1 = new SingleLinkedList();
//
//		list1.insertAtEnd(15);
//		list1.insertAtEnd(16);
//		list1.insertAtEnd(17);
//		list1.insertAtEnd(18);
//		list1.insertAtEnd(19);
//		list1.insertAtEnd(22);
//
//		System.out.println("-----Merge two sorted linked lists creating new list-----");
//		SingleLinkedList mergeListWithNewList = list1.mergeCreatingNewList(sLList, list1);
//		mergeListWithNewList.displayList();
//		System.out.println("-----Merge two sorted linked lists  with out creating new lists-----");
//		SingleLinkedList test1 = new SingleLinkedList();
//		test1.insertAtEnd(1);
//		test1.insertAtEnd(3);
//		test1.insertAtEnd(5);
//		
//		SingleLinkedList test2 = new SingleLinkedList();
//		test2.insertAtEnd(2);
//		test2.insertAtEnd(4);
//		test2.insertAtEnd(6);
//
//		SingleLinkedList mergeListWithOutNewList = list1.mergeSortedLinkedLists(test1, test2);
//		mergeListWithOutNewList.displayList();
//		System.out.println("**************Insert cycle in list**************");
//		SingleLinkedList cycleList = new SingleLinkedList();
//		cycleList.insertAtEnd(10);
//		cycleList.insertAtEnd(20);
//		cycleList.insertAtEnd(30);
//		cycleList.insertAtEnd(40);
//		cycleList.insertAtEnd(50);
//		cycleList.insertAtEnd(60);
//		cycleList.insertAtEnd(70);
//		cycleList.insertAtEnd(80);
//		cycleList.insertAtEnd(90);
//		cycleList.displayList();
//		cycleList.insertCycle(50);
//		//cycleList.displayList(); //infinite loop
//		System.out.println("**************Detecting cycle in list**************");
//		boolean flag = cycleList.detectCycleInList();
//		System.out.println(flag);
//		System.out.println("**************Removing cycle in list**************");
//		cycleList.removeCycle();
//		cycleList.displayList();
//		
//		System.out.println("********SIngle linked list concatenation *****");
//		SingleLinkedList sLL = new SingleLinkedList();
//		sLL.insertAtEnd(10);
//		sLL.insertAtEnd(20);
//		sLL.insertAtEnd(30);
//		sLL.insertAtEnd(40);
//		sLL.insertAtEnd(50);
//		sLL.displayList();
//		SingleLinkedList sLL1 = new SingleLinkedList();
//		sLL1.insertAtEnd(60);
//		sLL1.insertAtEnd(70);
//		sLL1.insertAtEnd(80);
//		sLL1.insertAtEnd(90);
//		sLL1.insertAtEnd(100);
//		sLL1.displayList();
//		sLL.concatenateSingleLinkedList(sLL1);
//		sLL.displayList();
//		
//		System.out.println("print nth element from last");
//		sLL1.displayList();
//		sLL.printNthElementFromLast(2);
//		
//		System.out.println("find merging point of two linked lists");
//		
//		int mergPoint = sLL.findMergeNode(sLL,sLL1);
//		sLL.displayList();
//		sLL1.displayList();
//		System.out.println("mergepoint is "+mergPoint);
//




	}

}
