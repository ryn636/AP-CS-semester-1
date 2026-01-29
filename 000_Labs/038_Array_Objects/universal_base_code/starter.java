/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Wizard[] x = new Wizard[100];
		Warrior[] y = new Warrior[100];
		
		int wiz = 99;
		int war = 99;
		for(int i = 0; i < 100; i++){
			x[i] = new Wizard();
			y[i] = new Warrior();
		
		}
			

		int c =1;
		
		while (war >= 0 && wiz >= 0){
			while (y[war].isDead() == false && x[wiz].isDead() == false){
			if (c ==1){
			x[wiz].attack(y[war]);
			c =2;
				if (y[war].isDead() == true){
				if (war > 0){
				war--;
				} else {
				
					System.out.println("Wizards won with "+wiz+" left in their army");
				}
				break;
				}
			} else if (c ==2){
			y[war].attack(x[wiz]);
			c =1;
				if (x[wiz].isDead() == true){
				if (wiz > 0){
				wiz--;
				} else {
					System.out.println("Warriors won with "+war+" left in their army");
				}
				}
			}
			
		}//
		}//
		
	}//
}//
