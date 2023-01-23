package com.leetcode;

import java.util.HashMap;

public class LongestSubstringWithout_RepeatingChar_3 {
    public static void main(String[] args) {
        int length = getLongestSubstringWithoutRepeatingChar("abcabcbb");
        System.out.println("length is: " + length);
        length = getLongestSubstringWithoutRepeatingChar("bbbbb");
        System.out.println("length is: " + length);
        length = getLongestSubstringWithoutRepeatingChar("pwwkew");
        System.out.println("length is: " + length);
        length = getLongestSubstringWithoutRepeatingChar(" ");
        System.out.println("length is: " + length);
    }

    private static int getLongestSubstringWithoutRepeatingChar(String str) {
        HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (int i = 0; i < str.length(); i++) {
            char nextCharacter = str.charAt(i);
            charMap.put(nextCharacter, 1);
        }
        return charMap.size();
    }
}
