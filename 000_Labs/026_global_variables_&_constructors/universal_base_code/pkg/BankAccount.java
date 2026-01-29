/*
 *	Author:  Ryan Tran 
 *  Date: 
*/

package pkg;
import java.util.*;


public class BankAccount {
private	String owner;					
private	double balance;		
private	boolean isActive;	
private static int AccountNumber = (int)(Math.random()*(950)+50);
int AccountNumberr = AccountNumber++;

	public BankAccount() {		
		owner = new String("");
		AccountNumber = AccountNumber;
		balance = 0.0;
		isActive = true;
	}

	public BankAccount(String o, double b, boolean i){		
		owner = o;
		balance = b;
		isActive = i;
	}
	
	
	public String getOwner(){
		return owner; 
	}
	
	public void setOwner(String o){
		owner = o;
	}
	
	public double getBalance(){
		return balance; 
	}
	
	public void closeAccount(){
		isActive = false;
	}
	
	public boolean getActive(){
		return isActive;
	}
	
	public void deposit(double deposit){
		balance = balance-deposit;
	}
	
	public void withdraw(double withdrawl){
		if ((withdrawl > 0) || (withdrawl > balance)) {
			System.out.println("Input valid number");
		} else {
			balance = balance-withdrawl;
		}
	}
	
	// -------METHODS-------
	public void BankToString(){			
		System.out.println("		  Account Info	      ");
		System.out.println("------------------------------");
		System.out.println("Owner: " + owner);
		System.out.println("Account Number: " + AccountNumber);
		System.out.println("Balance: " + balance);
			if (isActive == true) {
				System.out.println("Active: yes");
			} else {
				System.out.println("Active: no");
			}
		System.out.println("------------------------------");
		System.out.println("");
	}
}//