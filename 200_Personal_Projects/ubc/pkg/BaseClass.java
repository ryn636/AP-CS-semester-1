/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class ShoppingCartItem {
	private	int quantity;
	private	double cost;
	private	String item;
		
	public ShoppingCartItem() {
		quantity = 0;
		cost = 0.0;
		item = "unknown";
	}
	
	public ShoppingCartItem(int q, double c, String i){
		quantity = q;
		cost = c;
		item = i;
	}	
	
	
	public int returnQ(){
		return quantity;
	} 
	
	public double returnC(){
		return cost;
	} 
	
	public int returnI(){
		return item;
	} 
	
	public void cartToString(){
		System.out.println("You have "+returnQ()+" of "+returnI());
	}
	
	
}//
