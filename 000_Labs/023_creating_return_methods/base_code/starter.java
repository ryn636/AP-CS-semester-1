/*
 *	Author:  Ryan Tran
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner a = new Scanner(System.in);
	
	System.out.println("What is your base number?");
	int b = a.nextInt();
	System.out.println("What is your exponent?");
	int c = a.nextInt(); 
	power(b, c);
	System.out.println(power(b, c));
	



	}//
	
	public static int power(int b, int c) {
		int x = (int)(Math.pow(b, c));
		return x; 
	}
	
}//
