/*
 *	Author:  Ryan Tran
 *  Date: 9/18/25
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
	Scanner a = new Scanner(System.in); 
	
	int money = 100;
while (money > 0) { // while 1
	int numb1 = (int)(Math.random()*(10)+1);
	int numb2 = (int)(Math.random()*(10)+1);
	int numb3 = (int)(Math.random()*(10)+1);
	
	
		String em1 = "";
		String em2 = "";
		String em3 = "";	

		if (numb1 == 1) {
			em1 = "🍉"; 
		} else if (numb1 ==2) {
			em1 = "🍓";
		} else if (numb1 ==3) {
			em1 = "🍒";
		} else if (numb1 == 4) {
			em1 = "🍍";
		} else if (numb1 == 5) {
			em1 = "🍋";
		} else if (numb1 == 6) {
			em1 = "⭐";
		} else if (numb1 ==7) {
			em1 = "❌";
		} else if (numb1 ==8 ) {
			em1 = "🪙";
		} else if (numb1 ==9) {
			em1 = "💲";
		} else if (numb1 ==10) {
			em1 = "💸";
		}
		
			if (numb2 == 1) {
			em2 = "🍉"; 
		} else if (numb2 ==2) {
			em2 = "🍓";
		} else if (numb2 ==3) {
			em2 = "🍒";
		} else if (numb2 == 4) {
			em2 = "🍍";
		} else if (numb2 == 5) {
			em2 = "🍋";
		} else if (numb2 == 6) {
			em2 = "⭐";
		} else if (numb2 ==7) {
			em2 = "❌";
		} else if (numb2 ==8 ) {
			em2 = "🪙";
		} else if (numb2 ==9) {
			em2 = "💲";
		} else if (numb2 ==10) {
			em2 = "💸";
		}
		
			if (numb3 == 1) {
			em3 = "🍉"; 
		} else if (numb3 ==2) {
			em3 = "🍓";
		} else if (numb3 ==3) {
			em3 = "🍒";
		} else if (numb3 == 4) {
			em3 = "🍍";
		} else if (numb3 == 5) {
			em3 = "🍋";
		} else if (numb3 == 6) {
			em3 = "⭐";
		} else if (numb3 ==7) {
			em3 = "❌";
		} else if (numb3 ==8 ) {
			em3 = "🪙";
		} else if (numb3 ==9) {
			em3 = "💲";
		} else if (numb3 ==10) {
			em3 = "💸";
		}
	

		System.out.print("Would you like to make money? (Yes/yes/Y/y): ");
		String b = a.next();
		
		boolean x = ((b.equals("Yes")) || (b.equals("yes")));
		boolean y = ((b.equals("Y")) || (b.equals("y")));
		
		if ((x==true) || (y==true)) { // if 1
			System.out.print("You have $"+money+". How much would you like to wager? ");
			 int c = a.nextInt(); 
			 
			 while ((c <= 0) || (c > money)) { // while 2
			System.out.print("Input a valid number: "); 
			c = a.nextInt();
			} //while 2
			
			money = money-c;
			System.out.println("Great! Lets play!!!");
			System.out.println("Your rolls are:");
			System.out.println("_________________________");
			System.out.println("    | "+em1+" | "+em2+" | "+em3+" |");
			System.out.println("_________________________");
			if ((numb1 == numb2) || (numb2 ==numb3) || (numb1 == numb3)) {
			money = money + (2*c);
			System.out.println("You Won! Your wager has been doubled.");
			System.out.println("You now have $"+money+".");
			} else if ((numb1 == numb2) && (numb2 == numb3) && (numb1 == numb3)) {
			money = money + (3*c);
			System.out.println("You Won! Your wager has been doubled.");
			System.out.println("You now have $"+money+".");
			} else {
			System.out.println("You didn't win, but you're almost due! Keep trying.");
			System.out.println("You now have $"+money+".");
			System.out.println(" ");
			System.out.println("---------------------------------------");
			}
		} else {
			System.out.println("Come back next time!");
			break;
		}// if 1 
			
	} // while 1
	if (money == 0) {
	System.out.println("You're out of money come back next month!");
	}
	} //
} //
