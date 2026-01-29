/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
	int x = (int)(Math.random()*(201-51)+51); 
	
	int [] arr = new int[x];
	
	System.out.println("The "+x+" elements are:");
	System.out.println("----------------------------------");
	
	for (int i = 0; i < x; i++){
		arr[i] = (int)(Math.random()*(100)+1); 
		System.out.print(arr[i]+", ");
	}
	
	System.out.println("");
	System.out.println("----------------------------------");
	
	
	findMax(arr);
	findMin(arr);
	findAverage(arr);

		
	}//
	public static int findMax(int[] arr){
		int max = 0;
		for (int i = 0; i < arr.length; i++){
			if (max < arr[i]){
				max = arr[i];
			}
		}
		System.out.println("The max of "+arr.length+" elements is: "+max);
		return max;
	}
	
	public static int findMin(int[] arr){
		int min = arr[0];
		for (int i = 0; i < arr.length; i++){
			if (min > arr[i]){
				min = arr[i];
			}
		}
		System.out.println("The min of "+arr.length+" elements is: "+min);
		return min;
	}
	
	public static double findAverage(int[] arr){
		double total = 0;
		
		for (int i = 0; i < arr.length; i++){
			total = total+arr[i];
		}
		double average = total/arr.length;
		System.out.println("The average of "+arr.length+" elements is: "+average);
		return average;
	}
	
	
}//
