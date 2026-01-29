/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}
	
	public static int randAge(){
	
		int rand2 = (int)(Math.random()*7);
		switch(rand2){
			case 0: return 12; 
			case 1: return 14;
			case 2: return 23;
			case 3: return 35;
			case 4: return 21;
			case 5: return 19;
			case 6: return 47;
            default: return 5;
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		
		int z = 0;
		
		PooleDwarf x1 = new PooleDwarf(randName(), randAge());
		PooleDwarf x2 = new PooleDwarf(randName(), randAge());
		PooleDwarf x3 = new PooleDwarf(randName(), randAge());
		PooleDwarf x4 = new PooleDwarf(randName(), randAge());		
		PooleDwarf x5 = new PooleDwarf(randName(), randAge());
		PooleDwarf x6 = new PooleDwarf(randName(), randAge());
		PooleDwarf x7 = new PooleDwarf(randName(), randAge());	
		
			if (x1.isSameName(x2.getName()) == true){
			z = z+1;
		}
			if (x1.isSameName(x3.getName()) == true){
			z = z+1;
		}
		
			if (x1.isSameName(x4.getName()) == true){
			z = z+1;
		}
		
			if (x1.isSameName(x5.getName()) == true){
			z = z+1;
		}
		
			if (x1.isSameName(x6.getName()) == true){
			z = z+1;
		}
		
			if (x1.isSameName(x7.getName()) == true){
			z = z+1;
		}
		
		System.out.println(x1.getName()+" was the name with "+z+" matches!");
		
	}
}
