// Package declaration (organizes related classes)
package CONTROL_STATEMENTS_PROGRAMS;

import java.util.*; // Importing the Scanner class for user input

// Main class
class UserInput {
    public static void main(String[] args) {

        // Creating Scanner object to take input from the user
        Scanner s = new Scanner(System.in);

        // Asking user for their name and storing it in a String variable
        System.out.println("Enter your name: ");
        String name = s.next();

        // Asking user for their age and storing it in an integer variable
        System.out.println("Enter your age: ");
        int age = s.nextInt();

        // Asking user for their gender (only first character taken)
        System.out.println("Enter your Gender: ");
        char gender = s.next().charAt(0);

        // Asking user for their phone number and storing it in a long variable
        System.out.println("Enter your Phone no: ");
        long phno = s.nextLong();

        // Printing a separator line for better output formatting
        System.out.println("---------------------------------------");

        // Displaying all the collected information
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Phone No: " + phno);
    }
}
