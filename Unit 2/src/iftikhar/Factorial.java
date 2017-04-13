package iftikhar;

import java.util.Scanner; 

/**
 * Factorial.java
 * Finds the factorial of the number that is inputed by the user.
 * @author Badar Iftikhar
 *05/03/2017
 */

public class Factorial {

	static int product;
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter a number.");
	int x = scan.nextInt();
	System.out.println(factorial(x));
	}
	
	/**
	 * Finds the factorial of and number and returns it to the user
	 * @param x
	 * @return the factorial of the inputed number
	 */
	
	public static int factorial(int x) {
		if (x < 0) {
			return -1;
		}
		else if (x == 0) {
			return 1;
		}
		else {
			int number = x;
			while (x > 1) {
				number = number * (x-1);
				x--;
			}
			return number;
		}
	}
	
}