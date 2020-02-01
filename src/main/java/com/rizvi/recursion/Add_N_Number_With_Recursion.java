package com.rizvi.recursion;

import java.util.Scanner;

/**
 * @author Rizvi on 11/9/2019
 * @project DataStructure-Algo
 */
public class Add_N_Number_With_Recursion {
	public static void main(String[] args) {
		System.out.println("How many numbers you want to add?");
		Scanner dataInput = new Scanner(System.in);
		int number = dataInput.nextInt();
		System.out.println("Summation of 0 to "+number+" is: "+ recursionSum(number));
	}

	private static int recursionSum(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		return n + recursionSum(n - 1);
	}
}

/*
 Question: Add the first n numbers

Output:
======
How many numbers you want to add?
6
Summation of 0 to 6 is: 21
*/