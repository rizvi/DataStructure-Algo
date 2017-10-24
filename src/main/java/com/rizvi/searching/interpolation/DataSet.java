package com.rizvi.searching.interpolation;

public class DataSet {
	int[] data;
	int numberTry;

	// If size is 10, data size[for array] will start from 0, but data will
	// start from 1.
	// data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}
	// array index = {0 ~ 9}
	public DataSet(int size) {
		data = new int[size];
		for (int i = 1; i <= size; i++) {
			data[i - 1] = i;
		}
		numberTry = 0;
	}

	// Size of data
	public int getSize() {
		return data.length;
	}

}
