/*
 *	Author:  Ryan Tran 
	Lab 10
 *  Date: 9/10/25 

*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	double min = 2.5, max = 3.5;  
	int x = (int)(Math.random()*10);
	int y = (int)(Math.random()*100 + 1);
	double z = (Math.random()* 1 + 2.5);
	double a = (Math.random() * 575 + 14 );
	System.out.print("A number between 0 and 9:" + " ");
	System.out.println(x);
		System.out.print("A number between 1 and 100:" + " ");
	System.out.println(y);
		System.out.print("A number between 2.5 and 3.5:" + " ");
	System.out.println(z);
		System.out.print("A number between 14 and 589:" + " ");
	System.out.print(a);
	

	
	}
}
