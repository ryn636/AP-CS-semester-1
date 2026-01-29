package pkg;
import java.util.Scanner;
import java.util.Random;


public class Spiderman {
	String actor;		// What's the actors name?
	int age;			// What's the age of the actor?
	String villain;		// Who's the arch nemesis of this Spiderman?

	public Spiderman(){
	
	actor = new String("unknown");	
	age = 0;
	villain = new String("unknown");
	}
	
	public Spiderman(String a) {
		actor = a;
		age = 0; 
		villain = "unknown"; 
		
	}
	public Spiderman(int b) {
		actor = "unknown";
		age = b; 
		villain = "unknown"; 
		
	}
	
	public Spiderman(String a, int b){
		actor = a;
		age = b; 
		villain = "unknown";
	}
	
	public Spiderman(String a, int b, String v) {
		actor = a;
		age = b; 
		villain = v; 
	}
		
	public int getAge() {
		return age;
	}
	
	public void setAge(int a) {
		age = a;
	}
		
						
						// ---------------------------------------
						// Create accessor and mutator methods for actor, age, and villain (6 total methods)
						// Ex: getAge and setAge
	


	// ---------------------------------------
	public void fight(){
		System.out.println("Spidey shoots his web at " + villain);
	}
	
	
	public void print(){
		System.out.println("-------------------------");
		System.out.println("Actor: " + actor);
		System.out.println("Age: " + age);
		System.out.println("Villain: "+villain);

		
	}

	public void printArt(){				// Prints out Spidey!
	System.out.println("           :              ");  
    System.out.println("           ;              ");   
    System.out.println("          :               ");   
    System.out.println("          ;               ");   
    System.out.println("         /                ");   
    System.out.println("       o/                 ");   
    System.out.println("     ._/\\___,             ");    
    System.out.println("         \\                ");   
    System.out.println("         /    			  "); 
	}
}
