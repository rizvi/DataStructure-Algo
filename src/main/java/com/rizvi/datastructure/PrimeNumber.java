package com.rizvi.datastructure;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * @author Rizvi on 12/22/2019
 * @project DataStructure-Algo
 */
public class PrimeNumber {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		int data = inp.nextInt();

		for (int i = 3; i <= data; i = i + 2) {
			boolean isPrime = checkPrime(i);
			if (isPrime) {
				System.out.println(i);
			}
		}
	}

	private static boolean checkPrime(int i) {
		boolean isPrime = true;
		for (int j = 3; j <= Math.sqrt(i); j = j + 2) {
			if (i % j == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}
