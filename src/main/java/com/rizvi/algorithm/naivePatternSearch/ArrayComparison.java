package com.rizvi.algorithm.naivePatternSearch;

import java.util.Arrays;

/**
 * @author Rizvi on 7/7/2020
 * @project DataStructure-Algo
 */
public class ArrayComparison {
	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] b = {1,2,3};
		if( Arrays.equals(a, b) )
			System.out.println("arrays with identical contents");
	}
}
