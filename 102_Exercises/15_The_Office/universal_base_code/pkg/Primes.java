package pkg;
import java.util.Scanner;
import java.util.Random;


public class Primes{
	int bee;	
	int in;
	boolean y;
	int b;
	
	public Primes() {		
		bee = 2;
		in = x;
		y = false;
		b =2;
		
	}
	
	
		public boolean find(int in) {
		
		
		while ((y == false) && (bee < in)) {
			 y = ((x%bee) == in);
			bee++;
		}
		
		
		if (y == false) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void print() {
		
		while (in > bee) {
			in--;
			if (find(in) == true) {
				System.out.println(in);
			}
			
		}
	}
	
}
