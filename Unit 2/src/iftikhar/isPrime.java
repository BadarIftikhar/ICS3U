package iftikhar;

import java.util.Scanner;

/**
 * isPrime.java
 * Finds if the number that is inputed by the user is prime.
 * @author Badar Iftikhar
 *05/03/2017
 */

public class isPrime {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to verify if it is a prime number");
		int x = scan.nextInt();
		System.out.println(primeNum(x));
		}
	
	/**
	 * Checks if the number is prime
	 * @param x
	 * @return true or false depending on the number
	 */
	
    public static boolean primeNum (int x) {
    	for (int i = x/2; i > 1; i--) {
    		if (x % i == 0) {
    			return false;
    		}
    	}
    	return true;
    }
}
