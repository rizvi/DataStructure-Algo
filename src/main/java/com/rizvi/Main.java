package com.rizvi;

import java.util.Scanner;

/**
 * @author Rizvi on 4/18/2020
 * @project DataStructure-Algo
 */
public class Main {
	public static void main( String[] args )
	{
		int v, t;
		Scanner inp = new Scanner(System.in);
		v = inp.nextInt();
		t = inp.nextInt();

		System.out.println(v*2*t);
	}
}