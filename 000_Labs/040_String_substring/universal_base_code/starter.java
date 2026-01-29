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
		
		System.out.println("Enter a word: ");
		Letters(a.next());
		

		
	}//
	
	public static void Letters(String b){
		System.out.println("Letter by Letter:");
		for (int i = 0; i < b.length(); i++){
		
			System.out.println(i+". "+b.substring(i, i+1));
		}
	}
	
}//
