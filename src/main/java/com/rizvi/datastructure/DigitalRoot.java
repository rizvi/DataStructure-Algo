package com.rizvi.datastructure;

/**
 * @author Rizvi on 12/24/2019
 * @project DataStructure-Algo
 */
public class DigitalRoot {
	public static void main(String[] args) {
		System.out.println(getDigitalRoot(453453));
	}

	private static int getDigitalRoot(int val) {
		int summationOfDigits = 0;
		while (val > 0) {
			int remainder = val % 10;
			val = val / 10;
			summationOfDigits = summationOfDigits + remainder;
		}
		return summationOfDigits > 9 ? getDigitalRoot(summationOfDigits) : summationOfDigits;
	}
}
