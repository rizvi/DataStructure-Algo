package com.rizvi.sorting.mergesort;

import java.util.Arrays;

/**
 * @author Rizvi on 2/4/2020
 * @project DataStructure-Algo
 */
public class MergeSort2 {
	public static void main(String[] args) {
		int firstArray[] = {2, 8, 15, 18, 20, 21, 23};
		int secondArray[] = {5, 9, 12, 17, 21, 24};

		int m = firstArray.length;
		int n = secondArray.length;

		System.out.println("m: " + m);
		System.out.println("n: " + n);

		doMergeSort(firstArray, secondArray, m, n);
	}

	private static void doMergeSort(int[] firstArray, int[] secondArray, int m, int n) {
		int expectedArray[] = new int[m + n];
		int i = 0; // index of firstArray
		int j = 0; // index of secondArray
		int k = 0; // index of expectedArray


		while (i < m && j < n) {
			if (firstArray[i] < secondArray[j]) {
				expectedArray[k++] = firstArray[i++];
			} else {
				expectedArray[k++] = secondArray[j++];
			}
		}

		// Add remaining elements
		for (; i < m; i++) {
			expectedArray[k++] = firstArray[i];
		}

		for (; j < n; j++) {
			expectedArray[k++] = secondArray[j];
		}
		Arrays.stream(expectedArray).forEach(s -> System.out.println(s));
	}
}
