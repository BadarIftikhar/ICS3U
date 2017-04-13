package iftikhar;

import java.util.Scanner;

/**
 * LargestNumber.java
 * Finds the largest number of the numbers that are inputed by the user.
 * @author Badar Iftikhar
 *05/03/2017
 */

public class LargestNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter 5 numbers");
		int [] num = new int [5];
		for (int i = 0; i<num.length; i++) {
			num [i] = scan.nextInt();
		}
		System.out.println("The largest number is " +largestNum(num));
	}
	
	/**
	 * This gets the largest number from the ones inputed
	 * @param ary This is the array of numbers
	 * @return a The largest  number
	 */
	public static int largestNum(int [] num) {
		int a = num [0];
		for (int i = 1; i < num.length; i++) {
			a = Math.max(a, num[i]);
		}
		return a;
	}
}
