/*
 *	Author: Ryan Tran
 *  Date: 9/20/25
 * 	Collaborator: Ryan T
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in); 
		

		
		System.out.println("The goal of the game is to guess the word with only 2 hints!");
		System.out.println("It is a color.");
		System.out.print("What's your guess? ");
		String x = a.next(); 
		
		if ((x).equals("yellow")) {
		System.out.println("You are Correct!");
			} 
			else if ((x).equals("Yellow")) {
			System.out.println("You are Correct!");
				} else {
					System.out.println("Incorrect but, it is the color of a Banana...");
				}
		String b = a.next();
		if ((b).equals("yellow")) {
		System.out.println("You are Correct!");
			} 
			else if ((b).equals("Yellow")) {
			System.out.println("You are Correct!");
				} else {
					System.out.println("Incorrect, one last try!");
					
		String c = a.next();
		if ((c).equals("yellow")) {
		System.out.println("You are Correct!");
			} 
			else if ((c).equals("Yellow")) {
			System.out.println("You are Correct!");
				} else {
					System.out.println("Incorrect, you lose, google 'Banana'");
				}
			
		}	
	}
}