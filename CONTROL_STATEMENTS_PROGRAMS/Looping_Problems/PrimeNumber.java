package CONTROL_STATEMENTS_PROGRAMS.Looping_Problems;

import java.util.*;

public class PrimeNumber {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int no = s.nextInt(); // take input from user
        int temp = 0; // counter to check divisibility

        // loop from 2 to no-1 to check divisibility
        for (int i = 2; i <= no - 1; i++) {
            if (no % i == 0) { // if divisible, not prime
                temp++;
                break; // no need to check further
            }
        }

        // check flag to decide prime or not
        if (temp == 0)
            System.out.println(no + " is a Prime number");
        else
            System.out.println(no + " is NOT a Prime number");
    }
}
