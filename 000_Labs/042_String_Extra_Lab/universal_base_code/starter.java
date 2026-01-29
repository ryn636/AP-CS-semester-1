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
		System.out.println("Enter a sentence:");
		String x = a.nextLine();
		Swap(x);


		
	}//
	public static void Swap(String a){
		int prev = 0;
		int words = 0; 
		String y = a+" ";
		
		while (y.indexOf(" ", prev) != -1){
			words++;
			prev = y.indexOf(" ", prev) +1;	
			
		}
		
	
		prev = 0;
		for(int i = 0; i < words; i++){
			System.out.print(lastW(y)+" ");
			y = y.substring(0, y.length()-(lastW(y).length()+1));
			

		}
		
		

	} 
	public static String lastW(String a){
		String word = "";
		int prev = 0;
		while (a.indexOf(" ", prev) != -1){
			word = a.substring(prev, a.indexOf(" ", prev));
			prev = a.indexOf(" ", prev) +1;	
		} 
		return word;
	}
	
	
}//
