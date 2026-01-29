/*
 *	Author: Ryan Tran
 *  Date:
 * 	Collaborator(s): 
*/
import java.util.Scanner;
import java.util.Random;


class starter {
	// The goal of the first method is to give back whether the year given is a leap year or not. 2004 is a leap year.

	// The goal of the second method is to add all the digits of a number up. Ex: 12345 has a total of 15.

	// The goal of the third method is to check if 3 numbers are consecutive. 15 16 17 are consecutive. It will print if they are or not.
	// Assume that the first number is always the smallest and the third number is always the largest.

	public static void main(String args[]) {
		System.out.println("----------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a year: ");
		int year = sc.nextInt();
		System.out.println();
		if(isLeapYear(year) == true)
			System.out.println(year + " is a leap year!");
		else
			System.out.println(year + " is not a leap year!");
		
		
			System.out.println(); 
		System.out.println("----------------------------------------");
		System.out.println("Enter a 5 digit number");
		int number = sc.nextInt();
		int sum = getDigitSum(number);
		System.out.println();
		System.out.println("The sum of the digits of " + number + " is " + sum);

		System.out.println();
		System.out.println("----------------------------------------");
		System.out.println("Enter a number");
		int num1 = sc.nextInt();
		System.out.println("Enter a number");
		int num2 = sc.nextInt();
		System.out.println("Enter a number");
		int num3 = sc.nextInt();
		System.out.println();
		if(printIfConsecutive(num1, num2, num3) == true)
			System.out.println(num1+", "+num2+", and "+num3+" are consecutive.");
		else
			System.out.println(num1+", "+num2+", and "+num3+" are not consecutive.");
		System.out.println();
		System.out.println("----------------------------------------");
	
	}
	
	public static boolean isLeapYear(int y) {
		boolean x;
		if ((y%4) == 0) {
		x = true;
		return x;
		} else 
		x= false;
		return x; 
	}
	public static int getDigitSum(int a) {
		int sum = 0;
		while (a > 0) {
		sum = sum +(a % 10);
		a = a/10;
		}
		return sum;
	}
	public static boolean printIfConsecutive(int a, int b, int c) {
		if ((a == b+1) && (b == c+1)) {
			return true;
		} else {
			return false; 
		} 
			
	
	}
	
	
}
