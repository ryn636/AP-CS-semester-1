/*
 *	Author:
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		
		int [] arr = new int[20];
		System.out.println("----------------------------------------");
		System.out.println("These are 20 numbers:");
		for (int i = 0; i < arr.length; i++){
			arr[i] = (int)(Math.random()*(10)+1);
			System.out.print(arr[i]+" ");
		}
		System.out.println("");
		System.out.println("----------------------------------------");
		
		int x = (int)(Math.random()*(10)+1);
		int count = 0;
		System.out.println("The random number to look for is "+x);
		
			for (int i = 0; i < arr.length; i++){
				if (arr[i] == x){
					System.out.println("Duplicate found at index "+i);
					count++;
				}
			}
		
		System.out.println("Total number of duplicates for "+x+" is "+count);
		System.out.println("----------------------------------------");
		System.out.println("Looking for two numbers in a row:");
		for (int i = 0; i < arr.length-1; i++){
			if (arr[i] == arr[i+1]){
				System.out.println("Two in a row found at indexes "+i+" and "+(i+1)+". The number is "+arr[i]);
			}
		}
		
		
		
		
		

	}//
}//
