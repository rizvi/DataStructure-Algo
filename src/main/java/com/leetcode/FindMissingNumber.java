package com.leetcode;

public class FindMissingNumber {
    public static void main(String[] args) {
        int arr[] = {4,3,8,7,2,1,6,9,10,13,12,11,14};
        long missingNumber = findTheMissingNumber(arr);
        System.out.println("Missing Number is: "+missingNumber);

    }

    private static long findTheMissingNumber(int[] arr) {
        boolean even = true;
        long[] callAry = new long[arr.length];

        for(int i=1; i<arr.length; i=i+2) {
            if (even) {
                callAry[i] = arr[i-1]-1;
                callAry[i+1] = callAry[i] + 5;
                even = !even;
            } else {
                callAry[i] = arr[i-1]-1;
                callAry[i+1] = callAry[i] - 5;
                even = !even;
            }
            System.out.println("callAry[i]: "+callAry[i]);
            System.out.println("callAry[i+1]: "+callAry[i+1]);
            System.out.println("Even status is: "+even);
            System.out.println("=============================");
        }
        for(int i=0; i<arr.length;i++) {
            System.out.println("arr[i] " + arr[i]);
            System.out.println("callAry[i] " + callAry[i]);

        }
        System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        for(int i=0; i<arr.length;i++) {
            System.out.println("arr[i] "+ arr[i]);
            System.out.println("callAry[i] "+ callAry[i]);
            if(arr[i] != callAry[i]) {
                System.out.println("I am in");
                return callAry[callAry.length-1]-1;
            }
        }
        return callAry[callAry.length-1]-1;
    }
}
