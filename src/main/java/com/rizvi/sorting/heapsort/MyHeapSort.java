package com.rizvi.sorting.heapsort;

public class MyHeapSort {

	static int total;

	static void swap(Comparable[] arr, int a, int b) {
		Comparable temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	static void heapify(Comparable[] arr, int i) {
		int left = i * 2;
		int right = i * 2 + 1;
		int grt = i;

		if (left <= total && arr[left].compareTo(arr[grt]) >= 0) {
			grt = left;
		}

		if (right <= total && arr[right].compareTo(arr[grt]) >= 0) {
			grt = right;
		}

		// if grt is changed then we need to swap
		if (grt != i) {
			swap(arr, i, grt);
			heapify(arr, grt);
		}
	}

	static void sort(Comparable[] arr) {
		total = arr.length - 1;
		for (int i = total / 2; i >= 0; i--) {
			heapify(arr, i);
		}
		for (int i = total; i > 0; i--) {
			swap(arr, 0, i);
			total--;
			heapify(arr, 0);
		}
	}

	public static void main(String[] args) {
		Integer arr[] = { 70, 1, 65, 35, 10, 25, 15 };

		System.out.println("Before sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}

		// call for sorting
		sort(arr);

		System.out.println("\n After sort:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}

}
