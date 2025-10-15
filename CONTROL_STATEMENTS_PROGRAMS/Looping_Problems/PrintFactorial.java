// ✅ Program: Find Factorial of a Number using For Loop
// Package name (for project organization)
package CONTROL_STATEMENTS_PROGRAMS.Looping_Problems;

import java.util.*; // Import Scanner class for user input

public class PrintFactorial {
    public static void main(String[] args) {

        // Create Scanner object to take input from user
        Scanner s = new Scanner(System.in);

        // Ask user for input
        System.out.print("Enter a number: ");
        int no = s.nextInt(); // Store the user input

        // Initialize factorial variable with 1
        int fact = 1;

        // ✅ Loop from 1 to 'no' to calculate factorial
        // Formula: n! = 1 × 2 × 3 × ... × n
        for (int i = 1; i <= no; i++) {
            fact = fact * i; // multiply current value of i with fact
        }

        // Print the result
        System.out.println("Factorial of " + no + " is: " + fact);

        // Close Scanner to prevent resource leak
        s.close();
    }
}
