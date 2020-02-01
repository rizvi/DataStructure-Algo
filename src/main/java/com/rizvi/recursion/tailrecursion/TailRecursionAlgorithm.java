package com.rizvi.recursion.tailrecursion;

/**
 * @author Rizvi on 11/9/2019
 * @project DataStructure-Algo
 */
public class TailRecursionAlgorithm {
	public void buildLayer(int height) {
		if (height == 0) return;
		System.out.println(height);
		buildLayer(height - 1);
	}
}