/*
 *	Author: Ryan Tran
 *  Date:
 *	Collaborator(s):
*/

import pkg.*;
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		
		boolean y = true;
		
		while (y == true) {
		System.out.print("Enter the Cipher: ");
		String b = a.nextLine();
		System.out.print("Does the Cipher have a key(yes/y/no/n)? ");
		String q = a.next();
		a.nextLine();
		boolean ab = ((q.equals("yes")) || (q.equals("y")));
		boolean ac = ((q.equals("no")) || (q.equals("n")));
		boolean ad = ((q.equals("hard")) || (q.equals("h")));
		
		if (ac == true) { 

			System.out.println(" ");
	
		String c = ciph(b);
		System.out.println(c);
			System.out.println(" ");
			
			
		} else if (ab == true) {
			System.out.print("What is the key? ");
			int numb = a.nextInt();
			a.nextLine();
			System.out.println(" ");
	
		String d = key(b, numb);
		System.out.println(d);
		System.out.println(" ");
		} else if (ad == true) {
			int i = 0;
			while (i < 100) {
    		System.out.println(Cipher.keyedEncode(b, i));
    		i++;
			}
		} else {
			break;
		}
		System.out.print("Would you like to continue(press enter)? ");
		String exit = a.nextLine();
			if (!exit.equals("")) {
				y = false;
			}
	
		
		}
		

		
		

	} //
	
	public static String ciph(String b) {
		String x = Cipher.encode(b);
		return x;
	} 
	
	public static String key(String b, int numb) {
		String k = Cipher.keyedEncode(b, numb);
		return k;
	}
	
}//
