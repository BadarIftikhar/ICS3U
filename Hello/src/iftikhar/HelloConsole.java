package iftikhar;

import hsa_new.Console;

/**
 * 
 * Hello Console
 * 
 * Feb. 24, 2017
 * @author Badar Iftikhar
 *
 */
public class HelloConsole {

	public static void main(String[] args) {
		Console c = new Console();
		c.println("Hello.");
		c.println("what is your age?");
		
		int age = c.readInt();
		c.println("You are " + age);
			
				
		

	}

}
