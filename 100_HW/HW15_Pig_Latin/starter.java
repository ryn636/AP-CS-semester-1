/*
   * Author: Ryan Tran
   * Date:
   * Collaborator(s):
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String x = a.nextLine();
		Pig(x);
		
		
		
	}
	//a e i o u 
	public static void Pig(String a){
		// the
		if (!(a.substring(a.length()-1).equals(" "))) {
		a = a+" ";
		}
		
		int prev = 0;
		String y = "";
		boolean a1;
		boolean e;
		boolean i;
		boolean o;
		boolean u;
		
		boolean a2;
		boolean e2;
		boolean i2;
		boolean	o2;
		boolean u2;
		
		while (a.indexOf(" ", prev) != -1){
			y = a.substring(prev, a.indexOf(" ", prev));
			
			if (y.length() == 1){
				System.out.print(y+"-way ");
			} else {
			
			 a1 = !((y.substring(0,2)).contains("a"));
			 e = !((y.substring(0,2)).contains("e"));
			 i = !((y.substring(0,2)).contains("i"));
			 o = !((y.substring(0,2)).contains("o"));
			 u = !((y.substring(0,2)).contains("u"));
			
			 a2 = !((y.substring(0,1)).contains("a"));
			 e2 = !((y.substring(0,1)).contains("e"));
			 i2 = !((y.substring(0,1)).contains("i"));
			 o2 = !((y.substring(0,1)).contains("o"));
			 u2 = !((y.substring(0,1)).contains("u"));
			
			if (a1 && e && i && o && u){
				System.out.print(y.substring(2)+"-"+y.substring(0,2)+"ay ");
			} else if (a2 && e2 && i2 && o2 && u2){
				System.out.print(y.substring(1)+"-"+y.substring(0,1)+"ay ");
			} else {
				System.out.print(y+"-way ");
			}
		
			
			}
			prev = a.indexOf(" ", prev) +1;	
		}	
	
	}
}//
