package com.binarytree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

	private Node root;

	public BinaryTree() {
		this.root = null;
	}

	public void preOrderTraversal() {
		System.out.println("**** pre order taversal NLR ****");
		preOrder(root);
		System.out.println();
	}

	private void preOrder(Node p) {
		if (p == null)
			return;
		System.out.print(p.info + " ");
		preOrder(p.lchild);
		preOrder(p.rchild);
	}

	public void inOrderTraversal() {
		System.out.println("****in order taversal LNR ****");
		inOrderTraverse(root);
		System.out.println();

	}

	private void inOrderTraverse(Node p) {
		if (p == null)
			return;
		inOrderTraverse(p.lchild);
		System.out.print(p.info + " ");
		inOrderTraverse(p.rchild);
	}

	public void postOrderTraversal() {
		System.out.println("***** postOrder LRN ****");
		postOrder(root);
		System.out.println();

	}

	private void postOrder(Node p) {
		if (p == null)
			return;
		postOrder(p.lchild);
		postOrder(p.rchild);
		System.out.print(p.info + " ");
	}

	public void levelOrderTraversal() {
		System.out.println("*** level ");
		if (root == null)
			return;
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		int count = 0;
		while (!queue.isEmpty()) {
			count++;
			Node temp = queue.poll();
			System.out.print(temp.info + " ");
			if (temp.lchild != null)
				queue.add(temp.lchild);
			if (temp.rchild != null)
				queue.add(temp.rchild);
		}

	}

	public int heightOfTree() {
		return height(root);
	}

	private int height(Node p) {
		if (p == null)
			return 0;
		int hL = height(p.lchild);
		int hR = height(p.rchild);
		return Math.max(hL, hR) + 1;

	}

	public void createTree() {
		root = new Node('a');
		root.lchild = new Node('b');
		root.rchild = new Node('c');
		root.lchild.lchild = new Node('d');
		root.lchild.rchild = new Node('e');
		root.rchild.lchild = new Node('f');
		root.rchild.rchild = new Node('g');

	}
}
