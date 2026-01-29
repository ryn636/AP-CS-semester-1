/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
	Scanner a = new Scanner(System.in); 
	
	System.out.println("What would you like? A face? An animal? Or an object?");
	String b = a.next();
	
	
	boolean x = ((b.equals("Face")) || (b.equals("face")));
	boolean y = ((b.equals("Animal")) || (b.equals("animal")));
	boolean z = ((b.equals("Object")) || (b.equals("object")));
	
		if (x == true) {
		System.out.println("   ____        ____    ");
		System.out.println("  ::::::      ::::::   ");
		System.out.println("  ______      ______   ");
		System.out.println(" /_($)_ /    /_($)_/   ");
		System.out.println("                       ");
		System.out.println("                  /    ");
		System.out.println("  _______________/     ");
		System.out.println("                       ");
		} else if (y == true) {
		System.out.println("          Frog");
		System.out.println("           ⬇     ");
		System.out.println("    :::::::::::::::");
		System.out.println(" ::::($):::::::($):::: ");	
		System.out.println("::::::::::/..\\::::::::::");
		System.out.println(" :|:::::::(  )::::::|:");	
		System.out.println("  M ::::::::::::::: M	");
		} else if (z == true) {
		System.out.println("       ___________     ");	
		System.out.println("      /          /|    ");		
		System.out.println("     /_________ /.|    ");	
		System.out.println("    |   This   |.:|    ");	
		System.out.println("    |    is    |::/    ");	
		System.out.println("    |   a box  |:/     ");	
		System.out.println("    |__________|/      ");	
		System.out.println("                       ");	
		} else {
			System.out.print("You have not chosen a valid option. Try again.");
		}

	}
}
