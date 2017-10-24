package com.rizvi.sorting.bubble;

/**
 * Bubble Sort Implementation
 * 
 * @author Rizvi
 * 
 */
public class MyBubbleSort {

	static void bubbleSort(int[] arr) {
		int n = arr.length;
		int temp = 0;

		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n - i; j++) {
				if (arr[j - 1] > arr[j]) {
					temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		int arr[] = { 70, 1, 65, 35, 10, 25, 15 };

		System.out.println("Before sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// call for sorting
		bubbleSort(arr);

		System.out.println("\n After sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
