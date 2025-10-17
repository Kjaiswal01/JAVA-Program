package CONTROL_STATEMENTS_PROGRAMS.Looping_Problems;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // input number

        int original = num; // store original number
        int rev = 0; // variable to store reverse

        // reverse the number
        while (num > 0) {
            int digit = num % 10; // get last digit
            rev = (rev * 10) + digit; // add it to reverse
            num = num / 10; // remove last digit
        }

        // check palindrome condition
        if (original == rev)
            System.out.println(original + " is a Palindrome number.");
        else
            System.out.println(original + " is NOT a Palindrome number.");

        sc.close();
    }
}
