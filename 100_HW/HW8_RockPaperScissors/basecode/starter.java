/*
 *	Author: Ryan Tran
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    
    String con = "";
    boolean y1 = false;
    
    
    while (y1 == false) {
        System.out.println("Would you like to play the computer(yes/no/done)?");
        con = a.next(); 
        a.nextLine();
        y1 = ((con.equals("Done")) || (con.equals("done")));
        
            if ((con.equals("Yes")) || (con.equals("yes"))) {
                int p = 0;
                System.out.println("");
                System.out.println("-----------------------------------------------------");
                System.out.println("Please enter rock/paper/scissors? ");
                    String b = a.next();
                    a.nextLine();
                    while (p == 0) {
                        if ((b.equals("Rock")) || (b.equals("rock"))) {
                             p = 1;
                        } else if((b.equals("Paper")) || (b.equals("paper"))) {
                             p = 2;
                        } else if ((b.equals("Scissors")) || (b.equals("scissors"))) {
                             p = 3;
                        } else {
                            System.out.println("Please enter a valid input(rock/paper/scissors):");
                            b = a.next();
                            a.nextLine();
                            System.out.println("");
                        }
                    }
                    
                    int c = getObject();
                    int d = compare2(p, c);
                    
                        if (d == 0){
                            System.out.println("You Tied!");
                            System.out.println("");
                            System.out.println("-----------------------------------------------------");
                        } else if (d == 1) {
                            System.out.println("You Win!");
                            System.out.println("");
                            System.out.println("-----------------------------------------------------"); 
                        } else if (d == 2) {
                            System.out.println("You Lose!");
                            System.out.println("");
                            System.out.println("-----------------------------------------------------");
                        }
                    
                   // 
                     
                        
                
                
                    
                    
            } else if ((con.equals("No")) || (con.equals("no"))) {
                int com = 0;
                int win1 = 0;
                int win2 = 0;
                int tie = 0;
                System.out.println("");
                System.out.println("-----------------------------------------------------");
                System.out.println("How many times would you like the computer to play itself? ");
                    int b = a.nextInt();
                    a.nextLine();
                        while (b < 0) {
                            System.out.println("Please enter a valid number:");
                            b = a.nextInt();
                        } 
                        
                    
                    
                while (com < b) {
                    com++;
                int p1 = getObject();
                int p2 = getObject();
                int d = compare2(p1, p2);
                    if (d == 1) {
                        win1 = win1+1;
                    } else if (d == 2) {
                        win2 = win2+1;
                    } else {
                        tie = tie+1;
                    }
                    
                    
                }
                    
                        
                    System.out.println("Player 1 wins: "+win1);
                    System.out.println("Player 2 wins: "+win2);
                    System.out.println("Ties: "+tie);
                    System.out.println("");
                    System.out.println("-----------------------------------------------------");   
            } else  if (y1 == true) {
                break;
            } else {
                System.out.println("Please enter a valid input.");
            }
            
    }
    
    
    
    
    }//
    
    public static int getObject() {
        int rand = (int)(Math.random()*3 + 1);
        return rand;
    }
    
    public static int compare2(int p, int c) {
        int t = 0;
                if (p == c) {
                     t = 0;
                } else if ((p == 1) && (c == 3)) {
                     t = 1;
                } else if ((p == 2) && (c == 1)) {
                     t = 1;                
                } else if ((p == 3) && (c == 2)) {
                     t = 1;
                } else if ((p == 1) && (c == 2)) {
                     t = 2;
                } else if ((p == 2) && (c == 3)) {
                     t = 2;
                } else if ((p == 3) && (c == 1)) {
                     t = 2;
                }
                return t;
        
        
    }
    
}//
