package pkg;
import java.util.Scanner;
import java.util.Random;


public class Map {
	int [][] map;		// 2D Array as a visual representation of the map
	int treasureX;		// Hidden treasure location X coordinate
	int treasureY;		// Hidden treasure location Y coordinate
	int posX;			// Current X position of the player
	int posY;			// Current Y position of the player

	/*
		Initialize the 2D array map with row and column lengths.
		Initialize starting location as 0,0 including the starting map value of 2 for current location.
		Call generateTreasure to create a treasure location.
	*/
	
	
	public Map(int row, int column){
		map = new int[row][column];
		posX = 0;
		posY = 0;
		map[posX][posY] = 2;
	}

	/*
		Generate and X and Y coordinate of the treasure given the size of the map
	*/
	public void generateTreasure(){
		treasureX = (int)(Math.random()*map.length);
		treasureY = (int)(Math.random()*map[0].length);
	}

	/*
		The position of the player is changed depending on a command given.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Integer paramter m for move represents the below commands:
		1 - up
		2 - down
		3 - left
		4 - right
		5 - left up
		6 - right up
		7 - left down
		8 - right down

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int m){
		if (m == 1){
			//up
			if (posX-1 < 0){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posX = posX-1;
				map[posX][posY] = 2;
			}
			//down
		} else if (m==2){
			if (posX+1 > map.length-1){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posX = posX+1;
				map[posX][posY] = 2;
			}
			//left
		} else if (m==3){
			if (posY-1 < 0){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posY = posY-1;
				map[posX][posY] = 2;
			}
		//right
		} else if (m==4){
			if (posY+1 > map[0].length-1){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posY = posY+1;
				map[posX][posY] = 2;
			}
		//left up
		} else if (m==5){
			if (posY-1 < 0){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posY = posY-1;
				map[posX][posY] = 2;
			}
			if (posX-1 < 0){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posX = posX-1;
				map[posX][posY] = 2;
			}
		//right up
		} else if (m==6){
			if (posY+1 > map[0].length-1){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posY = posY+1;
				map[posX][posY] = 2;
			}
			if (posX-1 < 0){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posX = posX-1;
				map[posX][posY] = 2;
			}
		//left down 
		} else if (m==7){
			if (posY-1 < 0){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posY = posY-1;
				map[posX][posY] = 2;
			}
			if (posX+1 > map.length-1){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posX = posX+1;
				map[posX][posY] = 2;
			}
			
		//right down
		} else if (m==8){
			if (posY+1 > map[0].length-1){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posY = posY+1;
				map[posX][posY] = 2;
			}
			if (posX+1 > map.length-1){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posX = posX+1;
				map[posX][posY] = 2;
			}
		} else {
			return false;
		}
		
		
		return true;	// Dummy value to make work
	}

	/*
		Given 2 integer parameters, check validity of location and move the current positon.
		This method should also change map values to indicate where the player is.
		Add 2 if the player is in the current location. (should also update old positons)

		Returns true if the player location was moved correctly
		Returns false if the player choose an invalid location
	*/
	public boolean move(int row, int col){
		
			if (row > map.length-1 || row < 0){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posX = row;
				map[posX][posY] = 2;
			}
			
			if (col > map[0].length-1 || col < 0){
				return false;
			}else {
				if (map[posX][posY] == 3){
				map[posX][posY] = 1;
				}else {
				map[posX][posY] = 0;
				}
				posY = col;
				map[posX][posY] = 2;
			}


		return true;	// Dummy value to make work
	}

	/*
		This method checks for treasure!
		Check the current position of the player
		Adding 1 indicates that the spot has been searched for treasure.
			Only check unchecked spots.
		Returns true if treasure was found, false otherwise.
	*/
	public boolean dig(){
	
		if (treasureX == posX && treasureY == posY){
			map[treasureX][treasureY] = 7;
			return true;
		} else {
			map[posX][posY] = 3;
			return false;
		}
			// Dummy value to make work
	}

	/*
		This method prints the location of the treasure.
		Set the map value of the treasure to 7 (7 is the lucky number!)
		Print where the treasure was
		Call printMap()
	*/
	public void printTreasureLoc(){
		
		System.out.println("The treasure was at ("+treasureX+", "+treasureY+").");
		if (treasureX == posX && treasureY == posY){
			map[treasureX][treasureY] = 7;
		} else {
			map[treasureX][treasureY] = 5;
		}
		
		printMap();

	}

	/*
		Print the entire map of the 2D array.
	*/
	public void printMap(){
	System.out.println("");
	System.out.println("MAP:");
		for(int r = 0; r < map.length; r++){
			System.out.print("| ");
			for(int c = 0; c < map[0].length; c++){
				System.out.print(map[r][c]+" ");
			
			}
			System.out.println("|");
		}
		System.out.println("");
	}//

}//
