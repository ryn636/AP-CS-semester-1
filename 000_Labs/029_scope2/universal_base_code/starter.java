/*
 *	Author:  Ryan t
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		Donkey donkey = new Donkey();
		Ogre shrek = new Ogre();
		
		int i; 
		System.out.println("");
		if(shrek.isUgly() == true){
		String statement = new String(shrek.getName() + " IS UGLY!");
		System.out.println(statement);
		}
		
		donkey.interact();
		for(i = 0; i < 5; i++){
			shrek.interact();
		}
		System.out.println("That printed out " + i + " times");

	}
}
