/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter Number of rows:");
		int rows = a.nextInt();
		a.nextLine();
		System.out.println("Enter Number of Columns");
		int col = a.nextInt();
		a.nextLine();
		System.out.println("What symbol would you want to use?");
		String s = a.next();
		System.out.println("");
		Box(rows, col, s);
		
		

		
	}//
	public static void Box(int a, int b, String x){
		for(int i = 0; i < a; i++){
			for(int c = 0; c < b; c++){
				System.out.print(x);
			}
			System.out.println("");
		}		
	} 
}//
