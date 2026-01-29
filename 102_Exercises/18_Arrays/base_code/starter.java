/*
 *	Author:Ryan Tran
 *  Date:
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		 int [] arr = new int[1001]; 
		 
		 int i = 0;
		 int c = 1;
		 
		 while (i < arr.length){
		 	arr[i] = c*3;
		 	System.out.println(arr[i]);
		 	i++;
		 	c++;
		 }
		 
		 i = 0;
		 
		System.out.println("");
		
		
		int [] arr2 = new int[1001];
		
		while (arr2.length > i){
			arr2[i] = 1000-i;
			System.out.println(arr2[i]);
			i++;
			c++;
		} 
				 
		 
	}//
}//
