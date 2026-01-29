/*
 *	Author:  
 *  Date: 
*/

import java.util.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		/*
			Create a program that creates a crossword puzzle hiding 1 word given by the user!

			1. Take a word from the user
			2. Create a 2D String array with a size of 5 larger than the word size in both directions
			3. Choose what direction the word should hide in
				- Vertical, Horizontal, Diagonal
				- EXTRA: Choose if the word should hide forward or backwards
			4. For each letter in the word, hide it into a spot in the 2D array
				- This spot should be chosen randomly within the bounds of the 2D array
			5. Once the word is stored in the array, fill up the rest of the array
				- Note what value is stored in the String array and replacing non-filled values with random letters
				- Given the letters array, choose a random letter to populate it with
			6. Print out the crossword puzzle!
			7. Ask a friend to find the word!
		*/
		
		Scanner a = new Scanner(System.in);

		String[] letters = {
            "a","b","c","d","e","f","g","h","i","j",
            "k","l","m","n","o","p","q","r","s","t",
            "u","v","w","x","y","z"
        };

		System.out.println("Enter a word into the crossword puzzle: ");
			String x = a.next();
			a.nextLine();
		
		String[][] arr = new String[x.length()+5][x.length()+5];
		System.out.println("");
		System.out.println("");
		System.out.println("--------Crossword Puzzle--------");
		
		int back = (int)(Math.random()*2 + 1);
		int dir =	(int)(Math.random()*3 + 1);
		
		int let = 0;
		
		int y = 0;
		int g = 0;
		
		for (int r =0; r < arr.length; r++){
			for(int c = 0; c < arr[0].length; c++){
				let = (int)(Math.random()*26);
				arr[r][c] = letters[let];
			}
		}
	
		if (back == 1) {
			if (dir == 1) {//horizontal
				y = (int)(Math.random()*(x.length()+5));
				
				for(int i = (int)(Math.random()*(arr.length-x.length()+1)); g < x.length(); i++){
					arr[y][i] = x.substring(g, g+1);
					g++;
				}
				
				

			} else if(dir ==2){//vert
				y = (int)(Math.random()*(x.length()+5));
				
				for(int i = (int)(Math.random()*(arr.length-x.length()+1)); g < x.length(); i++){
					arr[i][y] = x.substring(g, g+1);
					g++;
				}
			} else if(dir ==3){//diag
				
				y = (int)(Math.random()*(arr.length-x.length()+1));
				
				for(int i = (int)(Math.random()*(arr.length-x.length()+1)); g < x.length();){
					arr[y+g][i+g] = x.substring(g, g+1);
					g++;
				}
			}
			
		} else if(back == 2) {
			if (dir ==1){//hor
				y = (int)(Math.random()*(x.length()+5));
				
				for(int i = (int)(Math.random()*(arr.length-(x.length()-1))); g < x.length(); i++){
					arr[y][i] = x.substring(x.length()-(g+1),x.length()-g);
					g++;
				}
				
				
			}else if(dir ==2){//vert
				y = (int)(Math.random()*(x.length()+5));
				
				for(int i = (int)(Math.random()*(arr.length-(x.length()-1))); g < x.length(); i++){
					arr[i][y] = x.substring(x.length()-(g+1), x.length()-g);
					g++;
				}
			} else if(dir ==3){//diag
				y = (int)(Math.random()*(arr.length-x.length()+1)+(x.length()-1));
				
				for(int i = (int)(Math.random()*(arr.length-x.length()+1)+(x.length()-1)); g < x.length();){
					arr[y-g][i-g] = x.substring(g, g+1);
					g++;
				}
			}
			
		}//if 1
		
		
		
		
		for (int r = 0; r < arr.length; r++){
			System.out.print("| ");
			for (int c = 0; c < arr[0].length; c++){
				System.out.print(arr[r][c]+" ");
			}
			System.out.println("|");
		}
	
		
	}//
}//
