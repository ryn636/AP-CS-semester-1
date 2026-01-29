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
    	item = "Nothing";	
		cost = 0.0;
		quantity = 0;
	}
	
	public ShoppingCartItem(String i, double c, int q){
		item = i;
		cost = c;
		quantity = q;
	}
	
	public int getQuantity(){
		return quantity;
	} 
	
	public double getCost(){
		return cost;
	} 
	
	public String getItemName(){
		return item;
	} 
	
	public double getTotalCost(){
	    double x = getCost() * getQuantity();
	    return x;
	} 
	
	public double getTotalWithTax(){
	    double y = (getTotalCost() * (12.0/100.0))+getTotalCost();
	    return y;
	}
	
	public double quantityToCostCalculator(int a){
	    double z = a * getCost();
	    return z;
	}
	
	public boolean compareItemCost(double a){
	    a = item3.getCost();
	    if (item2.getCost() < a) {
	        return true;
	    } else {
	        return false;
	    }
	    
	}
	    
	
	public void cartToString(){
		System.out.println("You have "+getQuantity()+" of "+getItemName()+" for $"+getCost());
	}
	
	
}//
