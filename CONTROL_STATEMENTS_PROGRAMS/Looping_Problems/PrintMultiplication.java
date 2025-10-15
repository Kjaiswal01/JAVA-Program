// Program: Print Multiplication Table of a Given Number

package CONTROL_STATEMENTS_PROGRAMS.Looping_Problems;

import java.util.*; // Import Scanner class for user input

public class PrintMultiplication {
    public static void main(String[] args) {

        // ✅ Step 1: Create Scanner object to take input from user
        Scanner s = new Scanner(System.in);

        // ✅ Step 2: Ask user to enter a number for which the table is to be printed
        System.out.print("Enter the number you want to print table for: ");
        int no = s.nextInt(); // read integer input

        // ✅ Step 3: Use a for loop to print multiplication table (1 to 10)
        for (int i = 1; i <= 10; i++) {
            // Print in format: number * i = product
            System.out.println(no + " * " + i + " = " + (no * i));
        }

        // ✅ Step 4: Close Scanner to avoid resource leak
        s.close();
    }
}
