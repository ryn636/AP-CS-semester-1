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
	
	System.out.println("How many rows in your 2D array?");
	int x = a.nextInt();
	System.out.println("How many Columns in your 2D array?");
	int y = a.nextInt();
	System.out.println("");
	int[][] arr = new int[x][y];
	
	double avg = 0.0;
	
	
	
	for (int r = 0; r < x; r++){
		for(int c = 0; c < y; c++){
			arr[r][c] = (int)(Math.random()*10 +1);
			System.out.print(arr[r][c]+" ");
			avg = avg+arr[r][c];
		}
		
		System.out.println("");
	}
	avg = avg/(x*y);
	
	System.out.println("What row would you like to get the average of?");
	int b = a.nextInt();
	double ravg = 0.0;
	
	for (int c = 0; c < y; c++){
		ravg = ravg+arr[b-1][c];
	}
		ravg = ravg/y;
		System.out.println("");
	System.out.println("Row Average: "+ravg);
	System.out.println("Total Average: "+avg);
		
	}
}
