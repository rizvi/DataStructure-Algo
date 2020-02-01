package com.rizvi.recursion.headrecursion;

/**
 * @author Rizvi on 11/9/2019
 * @project DataStructure-Algo
 */
public class HeadRecursionAlgorithm {
	public void buildLayer(int height) {
		if (height == 0) return;
		buildLayer(height - 1);
		System.out.println(height);
	}
}
