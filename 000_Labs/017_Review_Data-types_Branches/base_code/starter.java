/*
 *	Author: Ryan Tran  
 *  Date: 
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner a = new Scanner(System.in);
	
	
	
	
	System.out.println("What is your name traveler?"); 
	String b = a.next();
	System.out.println("What is your title? ");
	String c = a.next();
	System.out.println("What do you choose to be Tarnished? A Warrior, Wizard, or Rouge?");
	String d = a.next();
	
	boolean x = ((d.equals("Warrior")) || (d.equals("warrior")));
	boolean y = ((d.equals("Wizard")) || (d.equals("wizard")));
	boolean z = ((d.equals("rouge")) || (d.equals("Rouge")));
	

	
	
	int ab = 20; 
	
		if ((x == true) || (y == true) || (z == true)) {
		System.out.println("So you have chosen the "+d+"! "+"So be it!");
		System.out.println(" ");
		System.out.println("You have 20 skill points to spend in the following: Strength, Dexterity, Intelligence, and Faith. Spend them wisely.");
		System.out.println(" ");
		System.out.print("Strength (1-10): ");
		int numb1 = a.nextInt();
			while ((numb1 < 0) || (numb1 >= 10)) {
			System.out.print("Try Again. ");
			System.out.print("Strength (1-10): ");
			numb1 = a.nextInt();
			} 
			if (numb1 > 0) {
			System.out.println("You have "+ (ab-numb1) +" points left to spend.");
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("Dexterity (1-10): ");
			}
		int numb2 = a.nextInt();
			while ((numb2 < 0) || (numb2 >= 10)) {
			System.out.print("Try Again. ");
			System.out.print("Dexterity (1-10): ");
			numb2 = a.nextInt();
			} 
			if (numb2 > 0) {
			System.out.println("You have "+ (ab-numb2) +" points left to spend.");
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("Intelligence (1-10): ");
			}
		int numb3 = a.nextInt();
		while ((numb3 < 0) || (numb3 >= 10)) {
			System.out.print("Try Again. ");
			System.out.print("Intelligence (1-10): ");
			numb3 = a.nextInt();
			} 
			if (numb3 > 0) {
			System.out.println("You have "+ (ab-numb3) +" points left to spend.");
			System.out.println(" ");
			System.out.println(" ");
			System.out.print("Faith (1-10): ");
			}
		int numb4 = a.nextInt();
			while ((numb4 < 0) || (numb4 >= 10)) {
			System.out.print("Try Again. ");
			System.out.print("Faith (1-10): ");
			numb4 = a.nextInt();
			} 
			if (numb4 > 0) {
			System.out.println(" ");
			if ((numb1+numb2+numb3+numb4) != 20)
			System.out.println("You have "+ (20-(numb1+numb2+numb3+numb4))+ " to spend next time.");
			} 
			
		System.out.println("------------------------------------------");
		System.out.println("You are " + b +" the "+ c +" of CVHS.");
		System.out.println("You're a "+d+" of the following stats:");
		System.out.println("Strength - "+numb1);
		System.out.println("Dexterity - "+numb2);
		System.out.println("Intelligence - "+numb3);
		System.out.println("Faith - "+numb4);
		System.out.println(" ");
		System.out.println("Goodbye Tarnished");
		

		} else {
		System.out.print("So you have not chosen a valid class. Try again next time.");
		}

			
			
			
			

	}
}
