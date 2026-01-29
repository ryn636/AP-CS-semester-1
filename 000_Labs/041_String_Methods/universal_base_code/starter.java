/*
* Author:
* Date:
*/

import java.util.*;

class starter {
public static void main(String args[]) {

Scanner a = new Scanner(System.in);

String[] letters = {
"a","b","c","d","e","f","g","h","i","j",
"k","l","m","n","o","p","q","r","s","t",
"u","v","w","x","y","z"
};

System.out.println("Enter a word into the crossword puzzle: ");
String x = a.next(); // keeps your original behavior (no spaces)

String[][] arr = new String[x.length() + 5][x.length() + 5];

System.out.println("");
System.out.println("");
System.out.println("--------Crossword Puzzle--------");

int back = (int)(Math.random() * 2 + 1); // 1 forward, 2 backward
//int dir = (int)(Math.random() * 3 + 1); // 1 horizontal, 2 vertical, 3 diagonal
 int dir = 3; // keep this if you want to force diagonal for testing

int let = 0;
int y = 0;
int g = 0;

/* ✅ FILL the board first (this fixes nulls)
for (int r = 0; r < arr.length; r++) {
for (int c = 0; c < arr[0].length; c++) {
let = (int)(Math.random() * 26);
arr[r][c] = letters[let];
}
}
*/
// ✅ PLACE WORD
if (back == 1) { // forward
if (dir == 1) { // horizontal
y = (int)(Math.random() * arr.length);
int startCol = (int)(Math.random() * (arr.length - x.length() + 1));

g = 0;
for (int i = startCol; g < x.length(); i++) {
arr[y][i] = x.substring(g, g + 1);
g++;
}

} else if (dir == 2) { // vertical
y = (int)(Math.random() * arr.length);
int startRow = (int)(Math.random() * (arr.length - x.length() + 1));

g = 0;
for (int i = startRow; g < x.length(); i++) {
arr[i][y] = x.substring(g, g + 1);
g++;
}

} else if (dir == 3) { // diagonal down-right
int startRow = (int)(Math.random() * (arr.length - x.length() + 1));
int startCol = (int)(Math.random() * (arr.length - x.length() + 1));

g = 0;
while (g < x.length()) {
arr[startRow + g][startCol + g] = x.substring(g, g + 1);
g++;
}
}

} else { // back == 2 backward
if (dir == 1) { // horizontal backwards
y = (int)(Math.random() * arr.length);
int startCol = (int)(Math.random() * (arr.length - x.length() + 1));

g = 0;
for (int i = startCol; g < x.length(); i++) {
arr[y][i] = x.substring(x.length() - (g + 1), x.length() - g);
g++;
}

} else if (dir == 2) { // vertical backwards
y = (int)(Math.random() * arr.length);
int startRow = (int)(Math.random() * (arr.length - x.length() + 1));

g = 0;
for (int i = startRow; g < x.length(); i++) {
arr[i][y] = x.substring(x.length() - (g + 1), x.length() - g);
g++;
}

} else if (dir == 3) { // diagonal up-left (backwards style you had)
// choose an END point so that moving up-left stays in bounds
int endRow = (int)(Math.random() * (arr.length - x.length() + 1)) + (x.length() - 1);
int endCol = (int)(Math.random() * (arr.length - x.length() + 1)) + (x.length() - 1);

g = 0;
while (g < x.length()) {
arr[endRow - g][endCol - g] = x.substring(x.length() - (g + 1), x.length() - g);
g++;
}
}
}

// ✅ PRINT (now there are no nulls)
for (int r = 0; r < arr.length; r++) {
System.out.print("| ");
for (int c = 0; c < arr[0].length; c++) {
System.out.print(arr[r][c] + " ");
}
System.out.println("|");
}

}
}
