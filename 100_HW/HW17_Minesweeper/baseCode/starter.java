import java.util.*;

class starter{
    public static void main(String[] args){
        System.out.println("Welcome to Minesweeper!");
        System.out.println("On the grid, 9 means untouched space.");
        System.out.println("Any other number means how many bombs are adjacent to the square.");
        System.out.println("Clear all empty spots and don't touch the bombs!");
        System.out.println();
        
        System.out.println("How difficult would you like the game?");
        System.out.println("1 - Easy (10 bombs)");
        System.out.println("2 - Medium (25 bombs)");
        System.out.println("3 - Hard (40 bombs)");
        System.out.println("4 - Impossible (99 bombs)");
        
        Scanner sc = new Scanner(System.in);
        int diff = sc.nextInt();
        
        int[][] guessGrid = new int[10][10];
        for(int i = 0; i < guessGrid.length; i++){
            for(int j = 0; j < guessGrid[0].length; j++){
                guessGrid[i][j] = 9;
            }
        }
        
        
        int[][] bombProxGrid = new int[10][10];
        mapSetUp(diff, bombProxGrid); // place bombs
        printGrid(guessGrid); //guess grid
        System.out.println("-------------------------------------");

        boolean alive = true;
        while(alive){
            System.out.print("Please enter a row: ");
            int r = sc.nextInt();
            System.out.print("Please enter a col: ");
            int c = sc.nextInt();
            
            boolean boom = move(r, c, bombProxGrid);
            if(boom){           
                System.out.println("-------------------------------------");
                System.out.println("You've hit a bomb! Better luck next time!");
                printGrid(bombProxGrid);
                break;
            }
            reveal(r, c, guessGrid, bombProxGrid);
            printGrid(guessGrid);
            System.out.println("-------------------------------------");
            if(checkWin(guessGrid, bombProxGrid)){
                System.out.println("You won! Congratz!");
                break;
            }
        }
    }
    
    public static void mapSetUp(int diff, int [][] bombProxGrid){
        int bomb =0;
        int ee = 0;
        int gg = 0;
        
        if (diff == 1){
            while(bomb != 10){
                ee = (int)(Math.random()*10);
                gg =(int)(Math.random()*10);
                
                if (bombProxGrid[ee][gg] == 0){
                    bombProxGrid[ee][gg] = 9;
                    bomb++;
                 }
            }
         
            
            for(int r = 0; r < 10; r++){
                for(int c = 0; c <10; c++){
                    if (bombProxGrid[r][c] == 9){
                        addAdj(r, c, bombProxGrid);
                    }
                }
            }
        
        } else if(diff == 2){
                while(bomb != 25){
                    ee = (int)(Math.random()*10);
                    gg =(int)(Math.random()*10);
                    
                    if (bombProxGrid[ee][gg] == 0){
                        bombProxGrid[ee][gg] = 9;
                        bomb++;
                     }
                }
                
            for(int r = 0; r < 10; r++){
                for(int c = 0; c <10; c++){
                    if (bombProxGrid[r][c] == 9){
                        addAdj(r, c, bombProxGrid);
                    }
                }
            }
        } else if(diff == 3){//40
            while(bomb != 40){
                    ee = (int)(Math.random()*10);
                    gg =(int)(Math.random()*10);
                    
                    if (bombProxGrid[ee][gg] == 0){
                        bombProxGrid[ee][gg] = 9;
                        bomb++;
                     }
                }
                
                
                for(int r = 0; r < 10; r++){
                for(int c = 0; c <10; c++){
                    if (bombProxGrid[r][c] == 9){
                        addAdj(r, c, bombProxGrid);
                    }
                }
            }
        } else {//99
            while(bomb != 99){
                    ee = (int)(Math.random()*10);
                    gg =(int)(Math.random()*10);
                    
                    if (bombProxGrid[ee][gg] == 0){
                        bombProxGrid[ee][gg] = 9;
                        bomb++;
                     }
                }
        } 
    }

    
    public static void addAdj(int r, int c, int [][] bombProxGrid){
        if (r > 0 && r < 9 && c > 0 && c < 9){// middle
            if (bombProxGrid[r+1][c] != 9){
               bombProxGrid[r+1][c]++; 
            }
            if (bombProxGrid[r-1][c] != 9){
                bombProxGrid[r-1][c]++;
            }
            if(bombProxGrid[r][c+1] != 9){
                bombProxGrid[r][c+1]++;
            }
            if(bombProxGrid[r][c-1] != 9){
                bombProxGrid[r][c-1]++;
            }
            if(bombProxGrid[r+1][c+1] != 9){
                bombProxGrid[r+1][c+1]++;
            }
            if(bombProxGrid[r+1][c-1] != 9){
                bombProxGrid[r+1][c-1]++;
            }
            if(bombProxGrid[r-1][c+1] != 9){
                bombProxGrid[r-1][c+1]++;
            }
            if (bombProxGrid[r-1][c-1] != 9){
                bombProxGrid[r-1][c-1]++;
            }
        }
        
        
        if (r == 0 && c > 0 && c < 9){//top
            if (bombProxGrid[r+1][c] != 9){
                bombProxGrid[r+1][c]++;
            }
            if (bombProxGrid[r][c+1] != 9){
                bombProxGrid[r][c+1]++;
            }
            if (bombProxGrid[r][c-1] != 9){
                bombProxGrid[r][c-1]++;
            }
            if (bombProxGrid[r+1][c+1] != 9){
                bombProxGrid[r+1][c+1]++;
            }
            if (bombProxGrid[r+1][c-1] != 9){
                bombProxGrid[r+1][c-1]++;
            }
     
        }
        
        if (r == 9 && c > 0 && c < 9){//bottom
            if (bombProxGrid[r-1][c] !=9){
                bombProxGrid[r-1][c]++;
            }
            if (bombProxGrid[r][c+1] !=9){
                bombProxGrid[r][c+1]++;
            }
            if (bombProxGrid[r][c-1] !=9){
                bombProxGrid[r][c-1]++;
            }
            if (bombProxGrid[r-1][c+1] !=9){
                bombProxGrid[r-1][c+1]++;
            }
            if (bombProxGrid[r-1][c-1] !=9){
                bombProxGrid[r-1][c-1]++;
            }
            
        }
        
         if (c == 0 && r > 0 && r < 9){//left
            if(bombProxGrid[r][c+1] != 9){
                bombProxGrid[r][c+1]++;
            }
            if(bombProxGrid[r-1][c] != 9){
                bombProxGrid[r-1][c]++;
            }
            if(bombProxGrid[r+1][c] != 9){
                bombProxGrid[r+1][c]++;
            }
            if(bombProxGrid[r+1][c+1] != 9){
                bombProxGrid[r+1][c+1]++;
            }
            if(bombProxGrid[r-1][c+1] != 9){
                bombProxGrid[r-1][c+1]++;
            }
            
        }
        
        if (c == 9 && r > 0 && r < 9){//right
        if (bombProxGrid[r][c-1] != 9){
            bombProxGrid[r][c-1]++;
        }
        if (bombProxGrid[r-1][c] != 9){
            bombProxGrid[r-1][c]++;
        }
        if (bombProxGrid[r+1][c] != 9){
            bombProxGrid[r+1][c]++;
        }
        if (bombProxGrid[r+1][c-1] != 9){
            bombProxGrid[r+1][c-1]++;
        }
        if (bombProxGrid[r-1][c-1] != 9){
            bombProxGrid[r-1][c-1]++;
        }
            
    }
 
        
       if(r == 0 && c ==0){// top left 
           if (bombProxGrid[r][c+1] != 9){
               bombProxGrid[r][c+1]++;
           }
           if (bombProxGrid[r+1][c] != 9){
               bombProxGrid[r+1][c]++;
           }
           if (bombProxGrid[r+1][c+1] != 9){
               bombProxGrid[r+1][c+1]++;
           }
       } 
       
       if(r==0 && c == 9){//top right
           if(bombProxGrid[r][c-1] != 9){
               bombProxGrid[r][c-1]++;
           }
           if (bombProxGrid[r+1][c] != 9){
               bombProxGrid[r+1][c]++;
           }
           if (bombProxGrid[r+1][c-1] != 9){
               bombProxGrid[r+1][c-1]++;
           }
       }
       
       if(r == 9 && c == 0){//bot left 
           if (bombProxGrid[r-1][c] != 9){
               bombProxGrid[r-1][c]++;
           }
           if (bombProxGrid[r][c+1] != 9){
               bombProxGrid[r][c+1]++;
           }
           if (bombProxGrid[r-1][c+1] != 9){
               bombProxGrid[r-1][c+1]++;
           }
       }
       
       if(r == 9 && c ==9){//bot right
           if (bombProxGrid[r-1][c] != 9){
               bombProxGrid[r-1][c]++;
           }
           if (bombProxGrid[r][c-1] != 9){
               bombProxGrid[r][c-1]++;
           }
           if (bombProxGrid[r-1][c-1] != 9){
               bombProxGrid[r-1][c-1]++;
           }
       }
        
    }//addAdj
 
    public static boolean move(int r, int c, int [][] bombProxGrid){
        if (bombProxGrid[r][c] == 9){
            return true;
        } else {
            return false;
        }
        
        
    }
    
    /*
        This method updates the guessGrid with a 3 by 3 square around the location guessed
        The values from the bomb grid should be translated to the answer grid
        After transferred, call the print method on the answer grid.
    */
    public static void reveal(int r, int c, int [][] guessGrid, int[][] bombProxGrid){
            if (r > 0 && r < 9 && c > 0 && c < 9){// middle
                guessGrid[r][c] = bombProxGrid[r][c];
                guessGrid[r+1][c] = bombProxGrid[r+1][c]; 
                guessGrid[r-1][c] =bombProxGrid[r-1][c];
                guessGrid[r][c+1] =bombProxGrid[r][c+1];
                guessGrid[r][c-1] =bombProxGrid[r][c-1];
                guessGrid[r+1][c+1] =bombProxGrid[r+1][c+1];
                guessGrid[r+1][c-1] =bombProxGrid[r+1][c-1];
                guessGrid[r-1][c+1] =bombProxGrid[r-1][c+1];
                guessGrid[r-1][c-1] =bombProxGrid[r-1][c-1];
        }
        
        
        if (r == 0 && c > 0 && c < 9){//top
            guessGrid[r][c] = bombProxGrid[r][c];
            guessGrid[r+1][c] =bombProxGrid[r+1][c]++;
            guessGrid[r][c+1] =bombProxGrid[r][c+1]++;
            guessGrid[r][c-1] =bombProxGrid[r][c-1]++;
            guessGrid[r+1][c+1] =bombProxGrid[r+1][c+1]++;
            guessGrid[r+1][c-1] = bombProxGrid[r+1][c-1]++;
     
        }
        
        if (r == 9 && c > 0 && c < 9){//bottom
          
            guessGrid[r][c] = bombProxGrid[r][c];
            guessGrid[r-1][c]= bombProxGrid[r-1][c];
            guessGrid[r][c+1] =bombProxGrid[r][c+1];
            guessGrid[r][c-1] =bombProxGrid[r][c-1];
            guessGrid[r-1][c+1] =bombProxGrid[r-1][c+1];
            guessGrid[r-1][c-1] = bombProxGrid[r-1][c-1];
        }
        
         if (c == 0 && r > 0 && r < 9){//left
            guessGrid[r][c] = bombProxGrid[r][c];
            guessGrid[r][c+1] =bombProxGrid[r][c+1];
            guessGrid[r-1][c] =bombProxGrid[r-1][c];
            guessGrid[r+1][c] =bombProxGrid[r+1][c];
            guessGrid[r+1][c+1] =bombProxGrid[r+1][c+1];
            guessGrid[r-1][c+1] =bombProxGrid[r-1][c+1];
        }
        
        if (c == 9 && r > 0 && r < 9){//right
        guessGrid[r][c] = bombProxGrid[r][c];
        guessGrid[r][c-1] =bombProxGrid[r][c-1];
        guessGrid[r-1][c] =bombProxGrid[r-1][c];
        guessGrid[r+1][c] =bombProxGrid[r+1][c];
        guessGrid[r+1][c-1] =bombProxGrid[r+1][c-1];
        guessGrid[r-1][c-1] =bombProxGrid[r-1][c-1];
            
    }
    
       if(r == 0 && c ==0){// top left 
           guessGrid[r][c] = bombProxGrid[r][c];
           guessGrid[r][c+1] =bombProxGrid[r][c+1];
           guessGrid[r+1][c] =bombProxGrid[r+1][c];
           guessGrid[r+1][c+1] =bombProxGrid[r+1][c+1];
       } 
       
       if(r==0 && c == 9){//top right
            guessGrid[r][c] = bombProxGrid[r][c];
            guessGrid[r][c-1] =bombProxGrid[r][c-1];
            guessGrid[r+1][c] =bombProxGrid[r+1][c];
            guessGrid[r+1][c-1] =bombProxGrid[r+1][c-1];
       }
       
       
       
       
       if(r == 9 && c == 0){//bot left 
           guessGrid[r][c] = bombProxGrid[r][c];
           guessGrid[r-1][c] =bombProxGrid[r-1][c];
           guessGrid[r][c+1] =bombProxGrid[r][c+1];
           guessGrid[r-1][c+1] =bombProxGrid[r-1][c+1];
       }
       
       if(r == 9 && c ==9){//bot right
            guessGrid[r][c] = bombProxGrid[r][c];
           guessGrid[r-1][c] =bombProxGrid[r-1][c]++;
           guessGrid[r][c-1] =bombProxGrid[r][c-1]++;
           guessGrid[r-1][c-1] =bombProxGrid[r-1][c-1]++;
       }
      
    }
    
    /*
        This method should traverse the entire 2D array and check
        whether the guess grid is exactly the same as the proximity grid
        Returning true if so, false if there is a discrepancy
    */
    public static boolean checkWin(int [][] guessGrid, int [][] bombProxGrid){
        int count = 0;
        
        for(int r = 0; r < 10; r++){
            for(int c = 0; c < 10; c++){
                if(guessGrid[r][c] == bombProxGrid[r][c]){
                    count++;
                }
            }
        }
        
        if (count == 100){
            return true;
        }else {
            return false;
        }   
    }
    
    public static void printGrid(int [][] grid){
		System.out.println("_________________________________________");
		for(int i = 0; i < grid.length; i++){
			for(int j = 0; j < grid[0].length; j++){
				System.out.print("| " + grid[i][j] + " | ");
			}
			System.out.println("");
		}
		System.out.println("_________________________________________");
	}
}