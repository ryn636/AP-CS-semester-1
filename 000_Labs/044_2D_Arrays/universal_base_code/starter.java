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
		
		int[][] arr = {
			{1, 2, 3, 4},	
			{2, 2, 3, 4},	
			{3, 3, 3, 4},	
			{4, 4, 4, 4},
			{5, 5, 5, 5}
		};
		System.out.println("The following 2D array has 5 rows and 4 columns:");
		for (int i = 0; i < 5; i++){
			for(int c = 0; c < 4; c++){
				System.out.print(arr[i][c]+" ");
			}
			System.out.println("");
		}


		
	}
}
