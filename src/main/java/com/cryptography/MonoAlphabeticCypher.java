package com.cryptography;

public class MonoAlphabeticCypher {
	// array of alphabets
	public static char alphabeticalChars[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	// array of mapped alphabets
	public static char mappingChars[] = {'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O', 'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C', 'V', 'B', 'N', 'M'};

	/**
	 * Encrypt the String
	 *
	 * @param str
	 * @return
	 */
	public static String encryptStr(String str) {
		String encrypted_msg = "";
		// traverse the string
		for (int p = 0; p < str.length(); p++) {
			for (int q = 0; q < 26; q++) {
				// match the alphabets of the string with the array's alphabets
				if (str.charAt(p) == alphabeticalChars[q]) {
					encrypted_msg += mappingChars[q];
					break;
				}
				// If the character is a special character, add it as it is
				if (str.charAt(p) < 'a' || str.charAt(p) > 'z') {
					encrypted_msg += str.charAt(p);
					break;
				}
			}
		}
		return encrypted_msg;
	}

	/**
	 * Decrypt the String
	 *
	 * @param str
	 * @return
	 */
	public static String decryptStr(String str) {
		String decrypted_msg = "";
		// traverse the string
		for (int p = 0; p < str.length(); p++) {
			for (int q = 0; q < 26; q++) {
				// match characters
				if (str.charAt(p) == mappingChars[q]) {
					decrypted_msg += alphabeticalChars[q];
					break;
				}
				// For special characters
				if (str.charAt(p) < 'A' || str.charAt(p) > 'Z') {
					decrypted_msg += str.charAt(p);
					break;
				}
			}
		}
		return decrypted_msg;
	}

	public static void main(String args[]) {
//		String str = "This is a normal string!";
		String str = "Beware the Jabberwock, my son! The jaws that bite, the claws that catch!";
		System.out.println("Normal text is : " + str);
		String encrypted_str = encryptStr(str.toLowerCase());
		System.out.println("Encrypted string is : " + encrypted_str);
		System.out.println("Decrypted string is : " + decryptStr(encrypted_str));
	}
}

/*
=== Output ===
Normal text is : Beware the Jabberwock, my son! The jaws that bite, the claws that catch!
Encrypted string is : WTVQKT ZIT PQWWTKVGEA, DN LGF! ZIT PQVL ZIQZ WOZT, ZIT ESQVL ZIQZ EQZEI!
Decrypted string is : beware the jabberwock, my son! the jaws that bite, the claws that catch!
 */

/* --------ASCII - Binary Character Table----------
Letter	ASCII Code	Binary	Letter	ASCII Code	Binary
		a	097	01100001	A	065	01000001
		b	098	01100010	B	066	01000010
		c	099	01100011	C	067	01000011
		d	100	01100100	D	068	01000100
		e	101	01100101	E	069	01000101
		f	102	01100110	F	070	01000110
		g	103	01100111	G	071	01000111
		h	104	01101000	H	072	01001000
		i	105	01101001	I	073	01001001
		j	106	01101010	J	074	01001010
		k	107	01101011	K	075	01001011
		l	108	01101100	L	076	01001100
		m	109	01101101	M	077	01001101
		n	110	01101110	N	078	01001110
		o	111	01101111	O	079	01001111
		p	112	01110000	P	080	01010000
		q	113	01110001	Q	081	01010001
		r	114	01110010	R	082	01010010
		s	115	01110011	S	083	01010011
		t	116	01110100	T	084	01010100
		u	117	01110101	U	085	01010101
		v	118	01110110	V	086	01010110
		w	119	01110111	W	087	01010111
		x	120	01111000	X	088	01011000
		y	121	01111001	Y	089	01011001
		z	122	01111010	Z	090	01011010
Link: http://sticksandstones.kstrom.com/appen.html
*/
