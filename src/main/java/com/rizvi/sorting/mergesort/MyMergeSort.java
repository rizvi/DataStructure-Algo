package com.rizvi.sorting.mergesort;

public class MyMergeSort {

	int[] array;
	int[] tempArray;

	void prepareForSort(int[] arr) {
		// prepare for sorting
		this.array = arr;
		this.tempArray = new int[arr.length];
		doMergeSort(0, arr.length - 1);
	}

	private void doMergeSort(int lowerIndex, int higherIndex) {
		if (lowerIndex < higherIndex) {
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

			// Sorts the left side of the array(like 1 to 5)
			doMergeSort(lowerIndex, middle);
			// Sort the right side of the array(like 6 to 10)
			doMergeSort(middle + 1, higherIndex);
			// Now merge both sides
			mergePart(lowerIndex, middle, higherIndex);
		}
	}

	private void mergePart(int lowerIndex, int middle, int higherIndex) {
		System.out.println("==========================");
		System.out.println("lowerIndex: " + lowerIndex+", middle: " + middle+", higherIndex: " + higherIndex);
		System.out.println();
		System.out.println();
		for (int i = lowerIndex; i <= higherIndex; i++) {
			tempArray[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;

		while (i <= middle && j <= higherIndex) {
			if (tempArray[i] <= tempArray[j]) {
				array[k] = tempArray[i];
				i++;
			} else {
				array[k] = tempArray[j];
				j++;
			}
			k++;
		}
		while (i <= middle) {
			array[k] = tempArray[i];
			k++;
			i++;
		}

	}

	public static void main(String[] args) {
		int arr[] = { 70, 1, 65, 35, 10, 25, 15 };

		System.out.println("Before sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// call for sorting
		System.out.println();
		new MyMergeSort().prepareForSort(arr);

		System.out.println("\n After sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
