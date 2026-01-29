/*
 *	Author:Ryan Tran
 *  Date: 10/26/25
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Input a number and I'll print out every prime until that number");
		int x = a.nextInt();
		a.nextLine();
	
			if (x <= 0){
			} else {
			System.out.println("");
			print(x);
			}
		
		
	}//
	public static boolean check(int x) {
		int b =2;
			while(b < x){
				if ((x%b) == 0){
					return false;
				}
			b++;
		}
			return true;
	}
	
	public static void print(int x) {
		int b = 2;
			while (b < x) {
				if (check(b) == true) {
					System.out.println(b);
				}
			b++;
			}
	}
}//
