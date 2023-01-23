package com.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstLetterAppearTwice_2351 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String inputData = scanner.next();
//        char dat = repeatedCharacter(inputData);
        char dat = repeatedCharacter("nwcn");
        System.out.println("data: "+dat);
        dat = repeatedCharacter("abccbaacz");
        System.out.println("data: "+dat);

    }
    public static char repeatedCharacter(String s) {
        int strLength = s.length();
        HashMap<String, Integer> dataMap = new HashMap<String, Integer>();
        for(int i=0; i<strLength; i++) {
            char firstChar = s.charAt(i);
            Integer val = dataMap.get(Character.toString(firstChar));
            if(val != null){
                dataMap.put(Character.toString(firstChar), val + 1);
                return firstChar;
            } else {
                dataMap.put(Character.toString(firstChar), 1);
            }
        }
     return 0;
    }
}
