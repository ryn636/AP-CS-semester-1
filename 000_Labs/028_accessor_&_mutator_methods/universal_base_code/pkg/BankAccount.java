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
		owner = new String("unknown");
		AccountNumber = AccountNumber;
		balance = 0.0;
		isActive = true;
	}

	public BankAccount(String o, double b, boolean i){		
		owner = o;
		balance = b;
		isActive = i;
	}
	
	public BankAccount(String o, double b){
		owner = o;
		balance = b;
		isActive = true;
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
		
		System.out.println("Account closed for "+getOwner());
		System.out.print(" ");
		isActive = false;
		
	}
	
	public boolean getActive(){
		return isActive;
	}
	
	public void deposit(double deposit){
		if (isActive == false) {
			System.out.println("Account is closed. Cannot deposit.");
		} else {
		balance = balance+deposit;
		System.out.println("Deposited: $"+balance);
		}
	}
	
	public void withdraw(double withdrawl){
			if (isActive == false) {
			System.out.println("Account is closed. Cannot deposit.");
		} else if ((withdrawl > balance) || (withdrawl < 0)) {
			System.out.println("Insufficient funds");
		} else {
			balance = balance-withdrawl;
			System.out.println("Withdrew $"+withdrawl);
		}
	}
	
	public void checkBalance(){
		System.out.println("Acount Balance: "+getBalance());
	}


	public void BankToString(){			
		System.out.println("	Account Info	      ");
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