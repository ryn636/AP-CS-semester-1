/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Scanner a = new Scanner(System.in);
		Dog x = new Dog();
		
		System.out.println("Dog name?");
		x.setName(a.next());
		System.out.println("What age should "+x.getName()+" be?");
		x.setAge(a.nextInt());
		
		System.out.println(x.getName()+" is a dog that is "+x.getAge()+" years old!");
		System.out.println("Toto is a "+randBreed()+" that is 1 year old.");
		
		
		if (x.isSleeping() == true) {
			System.out.println(x.getName()+" is sleeping. Dont wake "+x.getName()+" up.");
			System.out.println("Toto is also sleeping!");
		} else {
			x.bark();
			System.out.println("Toto hears "+x.getName());
			System.out.println("Toto Barks!");
		}
		
		
		



	}//
	public static String randBreed(){
		int rand = (int)(Math.random()*5);
		switch(rand){
			case 0: return "Golden Retriever"; 
			case 1: return "Daschund";
			case 2: return "Beagle";
			case 3: return "German Shepherd";
			case 4: return "Corgi";
            default: return "Shiba Inu";
		}
	}
	
}//
