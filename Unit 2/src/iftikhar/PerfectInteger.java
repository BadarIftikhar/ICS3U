package iftikhar;
/**
 * PerfectInteger.java
 * @author Badar Iftikhar
 * Determines if the integer is perfect
 * 20/04/2017
 */
public class PerfectInteger {

	public static void main(String[] args) {
		for (int x = 1; x<1000; x++){
			int numbers = 0;
			for (int y = 1; y < x; y++){
				if (x % y ==0){
					numbers = numbers + y;
				}
			}
			if(numbers ==x){
				System.out.println(numbers);
			}
		}
		public static boolean isperfect(int a){
			if()
		}
	}
	
		
	}