package com.rizvi.tree.bst;

public class MyBinarySearchTree {

	public static void main(String[] args) {
		BST bst = new BST();

		bst.add(bst.root, bst.createNode(10));
		bst.add(bst.root, bst.createNode(12));
		bst.add(bst.root, bst.createNode(11));
		bst.add(bst.root, bst.createNode(13));
		bst.add(bst.root, bst.createNode(6));

		bst.search(11, bst.root);
		bst.search(500, bst.root);
	}

}
