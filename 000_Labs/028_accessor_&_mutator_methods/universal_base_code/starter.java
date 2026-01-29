/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BankAccount a = new BankAccount();
		a.BankToString();
		BankAccount x = new BankAccount("Mike Erhmantraut", 0.0);
		BankAccount y = new BankAccount("Walter White", 80000000);
		y.BankToString();
		BankAccount z = new BankAccount("Jesse Pinkman", 230670.41);
		z.BankToString();

	
	
	
		System.out.println();

		System.out.println("----------ACCOUNT 1 ACTIONS----------");
		x.setOwner("Mike Ehrmantraut");
		x.deposit(50325.58);
		System.out.println("The new owner of account a is " + x.getOwner());
		System.out.println("The account balance of " + x.getOwner() + "'s account is " + x.getBalance());
		System.out.println();

		System.out.println("----------ACCOUNT 2 ACTIONS----------");
		System.out.println(y.getOwner() + " is trying to withdraw $50000");
		y.withdraw(50000);
		System.out.println();

		System.out.println("----------ACCOUNT 3 ACTIONS----------");
		System.out.println(z.getOwner() + " is trying to withdraw $" + z.getBalance());
		z.withdraw(z.getBalance());
		z.checkBalance();
		z.closeAccount();
		z.deposit(1);
		
	}
}
