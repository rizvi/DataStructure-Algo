package com.rizvi.tree.bst;

public class BST {

	Node root;

	public BST() {
		root = null;
	}

	/**
	 * Create a new node
	 * 
	 * @param value
	 * @return
	 */
	public Node createNode(int value) {
		return new Node(value, null, null);
	}

	/**
	 * Add a node in tree
	 * 
	 * @param start
	 * @param newNode
	 */
	public void add(Node start, Node newNode) {
		if (root == null) {
			root = newNode;
			return;
		}

		if (newNode.value > start.value) {
			if (start.right == null) {
				start.right = newNode;
			}
			add(start.right, newNode);
		}

		if (newNode.value < start.value) {
			if (start.left == null) {
				start.left = newNode;
			}
			add(start.left, newNode);
		}
	}

	/**
	 * Search a node in the tree
	 * 
	 * @param value
	 * @param start
	 */
	public void search(int value, Node start) {
		if (start == null) {
			System.out.println("node is not found");
			return;
		}

		if (value == start.value) {
			System.out.println("node is found");
			return;
		}

		if (value == start.value) {
			System.out.println("node is found");
		}

		// if value is greater than current node value, it will be set to right
		// side
		if (value > start.value) {
			search(value, start.right);
		}

		// if value is less than current node value, it will be set to left side
		if (value < start.value) {
			search(value, start.left);
		}
	}

}
