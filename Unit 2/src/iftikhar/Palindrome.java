package iftikhar;

import java.util.Scanner;

/**
 * Palindrome.java
 * Indicates to user whether or not an entered word is a palindrome
 * @author Badar Iftikhar
 *04/18/2017
 */

public class Palindrome {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a word to check if it is a palindrome.");
		String Backwards = scan.nextLine();
		System.out.print(Palindrome(Backwards));
		}
	public static boolean Palindrome(String Backwards) {
		String word = "";
		for (int x = Backwards.length()-1; x >= 0; x--) {
			word = word + Backwards.charAt(x);
			}
		if (Backwards.equals(word)) {
			return true;
		}
		return false;
	}
}
