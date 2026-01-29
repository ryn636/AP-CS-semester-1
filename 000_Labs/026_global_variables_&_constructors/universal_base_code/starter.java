/*
 *	Author:  Ryan Tran
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		
		BankAccount x = new BankAccount();
		x.BankToString();
		
		
		BankAccount y = new BankAccount("Ryan Tran", 30000000, true);
		y.BankToString();
		
		
		BankAccount z = new BankAccount("Gim kyeom", 0.25, false);
		z.BankToString();
		
		
		BankAccount a = new BankAccount("John Smith", -243523, true);
		a.BankToString();
		
	}
}
