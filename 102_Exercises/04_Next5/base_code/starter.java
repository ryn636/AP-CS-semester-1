/*
 *	Author:Ryan Tran
 *  Date:9/9/25
 *	Collaborator(s): Ryan T
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Please enter a number:"); 
		int number = a.nextInt();
		int next1 = number+1;
		int next2 = number+2;
		int next3 = number+3;
		int next4 = number+4;
		int next5 = number+5;
		System.out.println("Here are the next 5 numbers:");
		System.out.println(next1 +","+" " + next2 +","+" " + next3 +","+" " + next4 +","+" " + next5);
		
		System.out.println("Here are the next five multiples of"+ " "+number+":");
		System.out.println(number*1 +","+" " + number*2 +","+" " + number*3 +","+" " + number*4 +","+" " + number*5);
		
		System.out.println("Here is"+" "+ number+" "+"divided by 100:" );
		double x = (double)number/100;
		System.out.println(x);
		
		System.out.println("Here is"+" "+ number+" "+"divided by 10:" );
		double y = (double)number/10;
		System.out.println(y);
		
	}	
}
