package com.binarytree;

public class BinaryTreeDemo {
	public static void main(String[] args) {
		BinaryTree tree = new BinaryTree();
		tree.createTree();
		tree.preOrderTraversal();
		tree.inOrderTraversal();
		tree.postOrderTraversal();
		tree.levelOrderTraversal();
		int height = tree.heightOfTree();
		System.out.println("Height of tree is :"+height);

	}

}
