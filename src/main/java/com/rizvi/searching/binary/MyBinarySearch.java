package com.rizvi.searching.binary;

/**
 * Binary Search Implementation
 * 
 * @author Rizvi
 * 
 */
public class MyBinarySearch {
	public static void main(String[] args) {
		DataSet data = new DataSet(10);
		int search = 4;
		Boolean isFound = false;

		int low = 0;
		int high = data.getSize() - 1;
		int mid = 0;

		while (!isFound) {
			if (low > high) {
				System.out.println("Number is not found.");
				break;
			}

			mid = low + (high - low) / 2;
			System.out.println("low: " + low + " value: " + data.data[low]);
			System.out.println("high: " + high + " value: " + data.data[high]);
			System.out.println("mid: " + mid + " value: " + data.data[mid]);
			data.numberTry++;
			if (data.data[mid] == search) {
				System.out.println("Element is found after " + data.numberTry
						+ " try.");
				break;
			}

			if (data.data[mid] < search) {
				low = mid + 1;
			}
			if (data.data[mid] > search) {
				high = mid - 1;
			}
			System.out.println("===========");
		}

	}

}
