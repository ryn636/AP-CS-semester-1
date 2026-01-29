/*
	Author:Ryan Tran 
	Date: 1/12/26
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("What would you like me to do?");
		String sent = sc.nextLine();
		
		while(sent.indexOf(" ") != -1){
			String word = sent.substring(0, sent.indexOf(" ")); 
			System.out.print(Mock(word)+" ");
			sent = sent.substring(sent.indexOf(" ")+1); 
		}
		System.out.print(Mock(sent));
		
		

	}//
	
	public static String Mock(String a){
		String x = "";
		for (int i = 0; i < a.length(); i++){
			if (i % 2 == 1){
				x = x + a.substring(i, i+1).toUpperCase();
			} else if (i % 2 == 0){
				x = x + a.substring(i, i+1).toLowerCase();
			}
		}
		
		return x;
	}
	
}//
