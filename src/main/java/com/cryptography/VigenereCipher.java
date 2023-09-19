package com.cryptography;

public class VigenereCipher {
	public static String encrypt(String text, final String key) {
		String res = "";
		text = text.toUpperCase();
		for (int i = 0, j = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character < 'A' || character > 'Z')
				continue;
			res += (char) ((character + key.charAt(j) - 2 * 'A') % 26 + 'A');
			j = ++j % key.length();
		}
		return res;
	}


	public static String decrypt(String text, final String key) {
		String res = "";
		text = text.toUpperCase();

		for (int i = 0, j = 0; i < text.length(); i++) {
			char character = text.charAt(i);
			if (character < 'A' || character > 'Z')
				continue;

			res += (char) ((character - key.charAt(j) + 26) % 26 + 'A');
			j = ++j % key.length();
		}
		return res;
	}


	public static void main(String[] args) {
		String key = "VIGENERECIPHER";
		String message = "Beware the Jabberwock, my son! The jaws that bite, the claws that catch!";
		String encryptedMsg = encrypt(message, key);
		System.out.println("String: " + message);
		System.out.println("Encrypted message: " + encryptedMsg);
		System.out.println("Decrypted message: " + decrypt(encryptedMsg, key));
	}
}

/*
== Output ==
String: Beware the Jabberwock, my son! The jaws that bite, the claws that catch!
Encrypted message: WMCEEIKLGRPIFVMEUGXQPWQVIOIAVEYXUEKFKBTALVXTGAFXYEVKPAGY
Decrypted message: BEWARETHEJABBERWOCKMYSONTHEJAWSTHATBITETHECLAWSTHATCATCH


Resource Link: https://www.sanfoundry.com/java-program-implement-vigenere-cipher/
 */