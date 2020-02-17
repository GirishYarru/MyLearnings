package com.binarytree;

public class Node {
	Node lchild;
	char info;
	Node rchild;

	public Node(char ch) {
		this.info = ch;
		lchild = null;
		rchild = null;
	}

}
