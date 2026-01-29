/* 
    Lecture note example - Methods
*/

import java.util.Scanner;

class LectureMethod{
    public static void main(String args[]) {
      Scanner a = new Scanner(System.in); 
      System.out.print("Number 1: ");
      int x = a.nextInt();
      System.out.print("Number 2: ");
      int y = a.nextInt();
      
      add(x, y);
      int numb2 = square(y)
      System.out.println(numb2);
      System.out.println(square(y));
	}
	
	
	public static int abs(int value) {
	    if (value < 0) {
	        return value * (-1); 
	       
	    } else {
	        return value; 
	    }
	    
	}
	
	public static int square(int a) {
	    int sq = a * a;
	    return sq; 
	}
	
	
	
	public static void add(int a, int b) {
	    int sum = a +b; 
	    System.out.print(sum);
	    return; 
	}
	
}