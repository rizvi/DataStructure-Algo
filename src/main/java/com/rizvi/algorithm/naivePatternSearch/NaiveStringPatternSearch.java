package com.rizvi.algorithm.naivePatternSearch;

/**
 * @author Rizvi on 6/16/2020
 * @project DataStructure-Algo
 */
public class NaiveStringPatternSearch {
	public static void main(String[] args) {
		String mainString = "ABAAABCDBBABCDDEBCABC";
		String pattern = "ABC";
		String locArray[] = new String[mainString.length()];
		int index = -1;
		naivePatternSearch(mainString, pattern, locArray, index);

		for(int i = 0; i <= index; i++) {
//			cout << "Pattern found at position: " << locArray[i]<<endl;
		}
	}

	private static void naivePatternSearch(String mainString, String pattern, String[] locArray, int index) {
		int patLen = pattern.length();
		int strLen = mainString.length();

		for(int i = 0; i<=(strLen - patLen); i++) {
			int j;
			for(j = 0; j<patLen; j++) {      //check for each character of pattern if it is matched
				String pieceString = mainString.substring(i, j);
				if(locArray[i+j] != pattern)
					break;
			}

			if(j == patLen) {     //the pattern is found
				index++;
//				locArray[index] = i;
			}
		}
	}
}
