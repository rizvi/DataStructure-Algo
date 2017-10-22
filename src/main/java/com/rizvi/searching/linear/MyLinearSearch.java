package com.rizvi.searching.linear;

/**
 * Linear Search Implementation
 * 
 * @author Rizvi
 * 
 */
public class MyLinearSearch {

	public static void main(String[] args) {
		DataSet data = new DataSet(1_000_000);
		int search = 700;
		Boolean isFound = false;

		for (int i = 0; i < data.getSize(); i++) {
			data.numberTry++;
			if (data.data[i] == search) {
				System.out.println("Element is found after " + data.numberTry
						+ " try.");
				isFound = true;
				break;
			}
		}

		if (isFound == false) {
			System.out.println("Number is not found.");
		}
	}

}
