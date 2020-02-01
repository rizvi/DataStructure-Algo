package com.rizvi.recursion;

import java.util.Scanner;

/**
 * @author Rizvi on 11/9/2019
 * @project DataStructure-Algo
 */
public class Add_N_Number_With_Iteration {
	public static void main(String[] args) {
		System.out.println("How many numbers you want to add?");
		Scanner dataInput = new Scanner(System.in);
		int number = dataInput.nextInt();
		System.out.println("Summation of 0 to "+number+" is: "+ iterationSum(number));
	}

	private static int iterationSum(int n) {
		int result = 0;
		for (int i = 0; i <= n; i++) {
			result = result + i;
		}
		return result;
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