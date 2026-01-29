/*
 *	Author:  Ryan Tran
 *  Date: 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner a = new Scanner(System.in);
	
		int b = 0;

	System.out.println("What is your name?");
	String x = a.next();
	System.out.println("Please enter an positive integer:");
	int y = a.nextInt();
	System.out.println(" ");
	
	
	while (b != y) {
		if (y <= b){
			System.out.print("Rerun Program.");
			break;
		} else if (b == y) {
			break; 
		}
		System.out.println(b+". "+x);
		b = b+1;
		}
	
	
	

		
	}
}
