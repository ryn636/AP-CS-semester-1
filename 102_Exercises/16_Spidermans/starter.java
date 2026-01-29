/*
	Author:  Rayn Tran
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		Spiderman x = new Spiderman("Toby Maguire", 48, "Green Goblin");
		x.print();
		
		Spiderman y = new Spiderman("Andrew Garfield", 40, "Electro");
		y.print();
		
		Spiderman z = new Spiderman("Tom Holland", 27, "The Vulture");
		z.print();
		
		Spiderman a = new Spiderman("Spooderman", 32, "Iron Deficiency");
		a.print();
		
		x.printArt();
		
	}
}
