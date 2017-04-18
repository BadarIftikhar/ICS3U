package iftikhar;

import java.util.Scanner;

/**
 * ReverseSentence.java
 * Reverses the sentence given by the user
 * @author Badar Iftikhar
 *04/18/2017
 */

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Please enter a sentence you want reversed.");
		String[] sentence = scan.nextLine().split(" ");
		for (int i = 0; i < sentence.length; i++) {
			for (int j = sentence[i].length()-1; j >= 0; j--) {
				System.out.print(sentence[i].charAt(j));
			}
			System.out.print(" ");
		}
	}
}
