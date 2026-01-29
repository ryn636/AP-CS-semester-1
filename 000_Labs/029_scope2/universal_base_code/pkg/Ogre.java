/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class Ogre {
	private String name;
	private boolean ugly;
	
	public Ogre() {
		String name = "Shrek";
		boolean ugly = true;
	}
	
	public Ogre(String name, boolean ugly) {
		 this.name = name;
		 this.ugly = ugly; 
	}

	public String getName(){
		return this.name;
	}

	public boolean isUgly(){
		return ugly;
	}

	public void interact(){
		System.out.println(shrek.getName() + ", what are you doing in my swamp?!");
	}


}
