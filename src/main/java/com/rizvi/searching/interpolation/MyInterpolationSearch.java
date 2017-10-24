package com.rizvi.searching.interpolation;

/**
 * Interpolation Search Implementation.
 * 
 * Used for phone number search or book indexing or dictionary
 * 
 * 0011, 0022, 0033, 1144, 1166, 1188, 3322, 3344, 3399
 * 
 * Index [0 to 8]
 * 
 * mid = low + (high - low / (A[high] - A[low])) * (X - A[low])
 * 
 * @author Rizvi
 * 
 */
public class MyInterpolationSearch {

	public static void main(String[] args) {
		DataSet data = new DataSet(1_000_000);
		int search = 999_999;
		Boolean isFound = false;

		int low = 0;
		int high = data.getSize() - 1;
		int mid = 0;

		while (!isFound) {
			if (low > high) {
				System.out.println("Number is not found.");
				break;
			}

			mid = low + ((high - low) / (data.data[high] - data.data[low]))
					* (search - data.data[low]);
			System.out.println("low: " + low + " value: " + data.data[low]);
			System.out.println("high: " + high + " value: " + data.data[high]);
			System.out.println("mid: " + mid + " value: " + data.data[mid]);
			data.numberTry++;
			if (data.data[mid] == search) {
				System.out.println("Element is found after " + data.numberTry
						+ " try.");
				isFound = true;
				break;
			}
		}
	}

}
