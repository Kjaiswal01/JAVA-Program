package CONTROL_STATEMENTS_PROGRAMS.Looping_Problems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Step 1: Create Scanner object

        System.out.print("Enter a number: "); // Step 2: Ask user for input
        int no = sc.nextInt(); // Step 3: Read integer input

        int rem, rev = 0;

        // Step 4: Logic to reverse number
        while (no != 0) {
            rem = no % 10;
            rev = rev * 10 + rem;
            no = no / 10;
        }

        System.out.println("Reversed Number: " + rev); // Step 5: Print result

        sc.close(); // Step 6: Close scanner
    }
}
