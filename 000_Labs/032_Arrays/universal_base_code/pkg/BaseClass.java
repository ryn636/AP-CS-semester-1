/*
 *	Author:  Ryan Tran
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
	int example = 0;

	public BaseClass(int e) {
		example = e;
		
	}
	
	public int get(){
		return example; 
	}
	
	public void print(){
		int [] arr = new int[example];
		int i = 1;
		int c = 0;
		
		while (c < arr.length){
			arr[c] = example-i;
			System.out.println(arr[c]);
			i++;
			c++;
		}
	}

}//

