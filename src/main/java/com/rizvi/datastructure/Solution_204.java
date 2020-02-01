package com.rizvi.datastructure;

/**
 * @author Rizvi on 12/22/2019
 * @project DataStructure-Algo
 */
class Solution_204 {
	public int countPrimes(int n) {
		n = n - 1;
		int count = 0;
		if (n == 2) {
			return 1;
		}
		if (n > 1) {
			count = 1;
		}
		for (int i = 3; i <= n; i = i + 2) {
			boolean isPrime = checkPrime(i);
			if (isPrime) {
				System.out.println(i);
				count++;
			}
		}
		return count;
	}

	private static boolean checkPrime(int i) {
		boolean isPrime = true;
		// Corner case
		if (i <= 1) {
			return false;
		}
		for (int j = 3; j <= Math.sqrt(i); j = j + 2) {
			if (i % j == 0) {
				isPrime = false;
				break;
			}
		}
		return isPrime;
	}
}

/*204. Count Primes

Count the number of prime numbers less than a non-negative number, n.

Example:

	Input: 10
	Output: 4
	Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
	Input: 2
	Output: 0
	Explanation: There are 0 prime numbers less than 2.
	Input: 3
	Output: 1
	Explanation: There are 1 prime numbers less than 3, that is 2.
	*/

