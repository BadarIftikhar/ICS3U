package iftikhar;

import java.util.Scanner;

/**
 * SumDigits.java
 * Finds the sum of the numbers that are inputed by the user.
 * @author Badar Iftikhar
 *05/03/2017
 */

public class SumDigits {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number with more than 2 digits");
		int a = scan.nextInt();
		System.out.println(sumDigits(a));
	}
	
	/**
	 * Finds the factorial of and number and returns it to the user
	 * @param x
	 * @return the total of the inputed numbers
	 */
	
public static int sumDigits(int a)
{
	int total = 0;
	while (a>0) {
		total = total + a%10;
		a = a/10;
	}
	return total;
}
}
