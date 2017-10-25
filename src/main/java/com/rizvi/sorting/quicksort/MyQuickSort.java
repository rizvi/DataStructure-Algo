package com.rizvi.sorting.quicksort;

/**
 * Quick sort implementation
 * 
 * @author Rizvi
 * 
 */
public class MyQuickSort {

	static void quickSort(int[] arr, int low, int high) {
		if (low > high) {
			return;
		}
		int mid = low + (high - low) / 2;
		int pivot = arr[mid];
		int i = low;
		int j = high;

		// if low is less than or equal to high, then go
		while (i <= j) {
			// if pivot is greater than left side
			while (arr[i] < pivot) {
				i++;
			}
			// if pivot is less than right side
			while (arr[j] > pivot) {
				j--;
			}

			if (i <= j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j--;
			}
		}
		if (low < j) {
			quickSort(arr, low, j);
		}
		if (high > i) {
			quickSort(arr, i, high);
		}
	}

	public static void main(String[] args) {
		int arr[] = { 70, 1, 65, 35, 10, 25, 15 };

		System.out.println("Before sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// call for sorting
		quickSort(arr, 0, arr.length - 1);

		System.out.println("\n After sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
