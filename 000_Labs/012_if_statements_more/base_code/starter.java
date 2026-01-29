/*
 *	Author:  Ryan Trna 
 *  Date: 9/11/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner a = new Scanner(System.in);
	
	
	System.out.println("Enter a Number:");
	int number1 = a.nextInt();
	System.out.println("Enter a Different Number:");
	int number2 = a.nextInt();
	
	if (number1 != number2) {
	System.out.print("Your Numbers are Different");
	}
	
		if (number1 == number2) {
	System.out.print("Your Numbers are the Same");
	}
	}
}
