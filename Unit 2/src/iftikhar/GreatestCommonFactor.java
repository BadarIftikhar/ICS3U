package iftikhar;

import java.util.Scanner;

/**
 * GreatestCommonFactor.java
 * Finds the greatest common factor that is inputed by the user.
 * @author Badar Iftikhar
 *05/04/2017
 */

public class GreatestCommonFactor {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		System.out.println("Enter your first number");
		int num1 = scan.nextInt();
		System.out.println("Enter your second number");
		int num2 = scan.nextInt();
		System.out.println("The greatest common factor of the numbers you entered is " +GCF(num1, num2));
	}
	
	/**
	 * Finds the greatest common factor of the numbers entered by the user
	 * @param num1 This will be the first number
	 * @param num2 This will be the second number
	 * @return the GCF of the inputed numbers
	 */
	public static int GCF(int num1, int num2) {
		if  (num1 > num2) {
			for(int i = num1; i>0; i--) {
				if(isDivisible(num1, i) == true && isDivisible(num2, i) == true) {
					return i;
				}
			}
		}
		if (num2 > num1) {
			for(int i = num2; i>0; i--) {
				if(isDivisible(num1, i) == true && isDivisible(num2, i) == true) {
					
				}
			}
		}
		return num1;
	}

	/**
	 * This part checks if the numbers are divisible by each other
	 * @param a This will be the first number
	 * @param b This will be the second number
	 * @return true or false if the numbers are divisible by each other 
	 */
	public static boolean isDivisible(int a, int b) {
		if(a%b == 0) {
			return true;
		}
		return false;
	}
}