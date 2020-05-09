package com.rizvi;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
        int v, t;
        Scanner inp = new Scanner(System.in);
        v = inp.nextInt();
        t = inp.nextInt();

        System.out.println(v*2*t);
    }
}
