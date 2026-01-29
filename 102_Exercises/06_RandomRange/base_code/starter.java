/*
 *	Author: Ryan Tran 
 *  Date: 9/16/25
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner a = new Scanner(System.in);
	
	System.out.print("Please enter a number:"+" ");
	int x = a.nextInt();
	System.out.print("Please enter a larger number:"+" ");
	int y = a.nextInt();
	System.out.println();
	
	
	while (x >= y || x+1==y) {
		System.out.print("Input a larger number: "); 
		y = a.nextInt();
		
	}
	
	System.out.println();
	System.out.println("Your range is" + " to " + x + " to "+y+".");
	System.out.println("Here are 5 numbers generated between" + " " + x + " " + "and" + " " + y + "."); 
	System.out.print((int)(Math.random()*(y-x)+x));
	System.out.print(","+" "+(int)(Math.random()*(y-x)+x));
	System.out.print(","+" "+(int)(Math.random()*(y-x)+x));
	System.out.print(","+" "+(int)(Math.random()*(y-x)+x));
	System.out.print(","+" "+(int)(Math.random()*(y-x)+x));

	
	}
}
