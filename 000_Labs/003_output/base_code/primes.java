/*
 *	Author:  Ryan Tran 
 *  Date: 
*/

package pkg;
import java.util.*;


public class primes{
	int bee;		
	
	public primes() {		
		bee = 2;
	}
	

	
	// -------METHODS-------
		public boolean find(int x) {
		boolean y = false;
		
		
		while ((y == false) && (bee < x)) {
			 y = ((x%bee) == 0);
			bee++;
		}
		
		
		if (y == false) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void print(int x) {
		
		while (bee <= x) {
			System.out.println("a");	
		}
	}
	
	}
