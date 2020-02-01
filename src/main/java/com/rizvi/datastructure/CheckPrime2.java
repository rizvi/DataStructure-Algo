package com.rizvi.datastructure;

import java.util.Scanner;

/**
 * @author Rizvi on 12/22/2019
 * @project DataStructure-Algo
 */
public class CheckPrime2 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int data = inp.nextInt();

		boolean isPrime = checkPrime(data);
		if (isPrime) {
			System.out.println(data + " is prime");
		} else {
			System.out.println(data + " is Not prime");
		}


	}

	private static boolean checkPrime(int i) {
		boolean isPrime = true;
		// Corner case
		if (i <= 1 || i % 2 == 0) {
			return false;
		}
		for (int j = 3; j < i; j = j + 2) {
			if (i % j == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}

// Time complexity :O(n)