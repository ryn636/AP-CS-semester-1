/*
    Lecture note example - Random!!
    
    Cleanest code you will ever see!!!!!!
*/


import java.util.Scanner;

class LectureRandom{
    public static void main(String args[]) {
    Scanner a = new Scanner(System.in); 
    
    System.out.println("Enter a number:");
    int x = a.nextInt(); 
    
   
    
    int e = 1;
    int s =0;
    
    int numba = 1;
    int numba2 = 0; 
    
 
    if (x/2 < x/2.0) {
    System.out.println(x + " " +"is odd");
    }
    
    if (x/2 == x/2.0) {
    System.out.println(x + " " +"is even");
    }
    
        if (x/3 < x/3.0) {
        s = e;
   
     }
     
        if (x/3 == x/3.0) {
     }
     
     if (x/4 < x/4.0) {
        s = e+1;
    
     }
     
        if (x/4 == x/4.0) {
     }
     
     if (x/5 < x/5.0) {
        s = e+2;
    
     }
     
        if (x/5 == x/5.0) {
     }
    if (s == e-1) {
    System.out.print(x + " " +"is divisible by all numbers 3, 4, and, 5");
    }
    
    if (s > e-1) { 
    System.out.println(x + " " +"is not divisible by all numbers 3, 4, and,  5");
    }
    System.out.println();
    
    
    
    System.out.println("Enter another number:");
    int y = a.nextInt(); 
    
     if (y/2 < y/2.0) {
    System.out.println("This number is odd");
    }
    
    
    
    if (y/2 == y/2.0) {
    System.out.println("This number is even");
    }
    
    
    
      if (y/2 < y/2.0) {
    System.out.println(y + " " +"is odd");
    }
    
    if (y/2 == y/2.0) {
    System.out.println(y + " " +"is even");
    }
    
        if (y/3 < y/3.0) {
        numba2 = numba;
   
     }
     
        if (y/3 == y/3.0) {
     }
     
     if (y/4 < y/4.0) {
        numba2 = numba+1;
    
     }
     
        if (y/4 == y/4.0) {
     }
     
     if (y/5 < y/5.0) {
        numba2 = numba+2;
    
     }
     
        if (y/5 == y/5.0) {
     }
    if (numba2 == numba-1) {
    System.out.print(y + " " +"is divisible by all numbers 3, 4, and, 5");
    }
    
    if (numba2 > numba-1) { 
    System.out.println(y + " " +"is not divisible by all numbers 3, 4, and, 5");
    }
    System.out.println();
    
    
    
	}
}
