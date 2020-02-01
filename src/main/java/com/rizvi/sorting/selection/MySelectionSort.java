package com.rizvi.sorting.selection;

public class MySelectionSort {
	static void selectionSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			// i points at the first number behind "wall"
			int index = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[index]) {
					// if first one is greater than second one, then set index
					// to second one --> j
					index = j;
				}
			}

			// Previously index was in i; now it is in j. So data need to be
			// swapped.
			if (index != i) {
				int temp = arr[index];
				arr[index] = arr[i];
				arr[i] = temp;
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
		selectionSort(arr);

		System.out.println("\n After sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
