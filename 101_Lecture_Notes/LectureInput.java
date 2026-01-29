/*
    Lecture note example - Input!!
*/
import java.util.Scanner; 

class LectureInput{
    public static void main(String args[]) {
        Scanner a = new Scanner(System.in);
        
        double x = 12.99;
        double y = 10.00;
        double z = 16.00;
        
        System.out.println(" 🥡🥠 菜 Welcome to China Restaurant #1 菜 🥠🥡"); 
        System.out.println("Here menu:");
        System.out.println("1. 😋 General Chicken With Rice - $"+x);
        System.out.println("2. 🥶 Eggwol - $"+y); 
        System.out.println("3. 😁 中国菜- $"+z);
        System.out.print("");
        
        System.out.println("Ho may I hep you? ho may I hep you? Who this?");
        String name = a.nextLine();
        System.out.println();
        
        System.out.println("How much Chicken combo you want?");
        int quantity1 = a.nextInt();
        System.out.println("How much Eggwol you want?");
        int quantity2 = a.nextInt();
        System.out.println("How much 中国菜?");
        int quantity3 = a.nextInt();
    
        double total1 = x * quantity1; 
        double total2 = y * quantity2; 
        double total3 = z * quantity3;
        double total = total1+total2+total3;
        System.out.println();
        System.out.println("Reciept:");
            if (quantity1 > 0);
         System.out.println(quantity1+" "+"x"+" "+"General Chicken with Rice");
            if (quantity2 > 0);
        System.out.println(quantity2+" "+"x"+" "+"Eggwol");
            if (quantity3 > 0);
        System.out.println(quantity3+" "+"x"+" "+"中国菜");
        
        System.out.println();
        System.out.println("Grand Total:");
        System.out.println(total);
	}
}
