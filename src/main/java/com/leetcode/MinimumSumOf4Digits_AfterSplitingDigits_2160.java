package com.leetcode;

import java.util.HashMap;
import java.util.Scanner;

public class MinimumSumOf4Digits_AfterSplitingDigits_2160 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String inputData = scanner.next();
//        char dat = repeatedCharacter(inputData);
        int summation = minimumSum(5523);
        System.out.println("Summation: "+summation);

    }
    public static int minimumSum(int num) {
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        hMap = getIntegerDigitCounter(num);
        hMap.forEach((K,V) -> System.out.println(K + " Contains : " + V + " times"));
        return 23;
    }

    private static HashMap<Integer,Integer> getIntegerDigitCounter(int data) {
        HashMap<Integer, Integer> hMap = new HashMap<Integer, Integer>();
        int sizeOfData = String.valueOf(data).length();
        for(int i=0; i<sizeOfData; i++) {
            int remainderOfData = data%10;
            if(null != hMap.get(remainderOfData)) {
                hMap.put(remainderOfData, hMap.get(remainderOfData)+1);
            } else {
                hMap.put(remainderOfData, 1);
            }
            data = data/10;
        }
        return hMap;

    }
}
