// Package declaration: organizes your classes into a folder structure
package CONTROL_STATEMENTS_PROGRAMS.Star_Pattern_Programs;

// // Class definition
// public class StarPattern8 {

//     // Main method: program execution starts here
//     public static void main(String[] args) {

//         // Outer loop for rows (i = 1 to 4)
//         for (int i = 1; i <= 4; i++) {

//             // Inner loop 1: prints spaces before stars in each row
//             // j starts from 4 and goes down to i (decreasing)
//             for (int j = 4; j >= i; j--) {
//                 System.out.print(" ");  // Print space without newline
//             }

//             // Inner loop 2: prints stars in each row
//             // Number of stars follows the pattern 1, 3, 5, 7 (2*i - 1)
//             for (int k = 1; k < (i * 2); k++) {
//                 System.out.print("*");  // Print star without newline
//             }

//             // Move to the next line after printing spaces and stars for current row
//             System.out.println();
//         }
//     }
// }

// Logic 2 ----------------->
// package CONTROL_STATEMENTS_PROGRAMS.Pattern_Programs; 
// (This line specifies the package name. It's optional and used for organizing programs.)

public class StarPattern8 {
    public static void main(String[] args) {

        // Outer loop: controls the number of rows (here 4 rows)
        for (int i = 1; i <= 4; i++) {

            // First inner loop: prints leading spaces for each row
            // This creates the pyramid shape by printing (4 - current row number) spaces
            for (int j = 4; j >= i; j--) {
                System.out.print(" "); // print space without moving to next line
            }

            // Second inner loop: prints the first part of stars in each row
            // Prints 'i' stars starting from 1 to current row number
            for (int k = 1; k <= i; k++) {
                System.out.print("*"); // print star without moving to next line
            }

            // Third inner loop: prints additional stars to complete the pyramid row
            // Starts from 2 to avoid duplicating the middle star, prints (i-1) stars
            for (int l = 2; l <= i; l++) {
                System.out.print("*"); // print star without moving to next line
            }

            // Move to next line after printing stars for the current row
            System.out.println();
        }
    }
}
