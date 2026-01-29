/*
 *	Author: Ryan Tran
 *  Date:
 * 	Collaborator(s): 
*/

import java.util.*;

public class Primes {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 0 and 1 are not prime
        }
        // Only check divisibility up to the square root of n
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false; // divisible by i → not prime
            }
        }
        return true;
    }

    // Method 2: Print all prime numbers up to a given limit
    public static void printPrimesUpTo(int limit) {
        System.out.println("Prime numbers up to " + limit + ":");
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // for clean output
    }

    // Main method to get input and call the print function
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        printPrimesUpTo(number);

        scanner.close();
    }
}
