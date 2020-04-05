package com.rizvi.searching.binary;

/**
 * @author Rizvi on 2/15/2020
 * @project DataStructure-Algo
 */
public class Binary1 {
	public static void main(String[] args) {
		int data[] = {1, 2, 4, 8, 45, 57, 77, 83, 94, 99, 100, 120, 124, 178};
		System.out.println("Position for search Item: " + doBinarySearch(data, 1)); //search for 83
	}

	private static int doBinarySearch(int[] data, int item) {
		int low = 0;
		int high = data.length - 1;
		int mid = 0;
		while (low <= high) {
			mid = (low + high) / 2;
			System.out.println("low: "+low+",    high: "+high+",    mid: "+mid);
			System.out.println("lowData: "+data[low]+",    highData: "+data[high]+",    midData: "+data[mid]);
			int guess = data[mid];
			System.out.println("guess: " + guess);
			if (guess == item) {
				return mid;
			}
			if (guess > item) {
				high = mid - 1;
//				System.out.println("high: "+data[high]);
			} else {
				low = mid + 1;
//				System.out.println("low: "+data[low]);
			}
		}
		return -1;
	}
}
