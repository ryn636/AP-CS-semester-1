import java.util.*;
import java.io.*;

class starter {
	public static void main(String args[]) throws Exception {
		//Creating File instance to reference text file in Java
        File text = new File("./passwords.txt");			// This file must be in the same folder as your java/class files.
     
        //Creating Scanner instance to read File in Java
        Scanner numLines = new Scanner(text);			// Scanner for counting number of lines
        Scanner sc = new Scanner(text);					// New Scanner for taking in the lines.
     
	 	// Count number of lines in text file.
		int count = 0; 
        while(numLines.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
			numLines.nextLine();
            count++;
        }  
		
		String [] passwords = new String[count];		// This is the array you will be using.

        //Reading each line of the file using Scanner class
		int i = 0;
        while(sc.hasNextLine()){		//Checks if there's a nextLine, breaks if none found.
            String line = sc.nextLine();
            passwords[i] = line;
			i++;
        }  

		/* ----------------------------------------------------------------------------------------- */
		// Start here, use the array passwords
        int pass1 = 0;
        int pass2 = 0;
        int pass3 = 0;
        int pass0 = 0;
        
        for (int  c = 0; c < passwords.length; c++){
            if ((passwords[c].length() >= 8) && (symbol(passwords[c])== true)){
            pass3++;
           } else if (passwords[c].length() >= 8){
             pass1++;
           } else if (symbol(passwords[c]) == true){
            pass2++;
           } else {
              pass0++;
           }
        }
		
		System.out.println("There are "+pass1+" passwords of strength 1 with 8 or more characters.");
		System.out.println("There are "+pass2+" passwords with a special symbol");
		System.out.println("There are "+pass3+" passwords of strength 1 with 8 or more characters and a special symbol.");
		System.out.println("There are "+pass0+" passwords with no strength");
		
	}//
	public static boolean symbol(String a){
	    boolean symbol = false; 
	        if(a.contains("!")){
	            symbol = true;
	        }else if (a.contains("@")){
	            symbol = true;
	        }else if (a.contains("#")){
	            symbol = true;
	        }else if (a.contains("$")){
	            symbol = true;
	        }else if (a.contains("%")){
	           symbol = true;
	        }else if (a.contains("^")){
	            symbol = true;
	        }else if (a.contains("&")){
	            symbol = true;
	        }else if (a.contains("*")){
	       symbol = true;
	        }
	    return symbol;
	}
}//
