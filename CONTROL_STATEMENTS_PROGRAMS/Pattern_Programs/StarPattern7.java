package CONTROL_STATEMENTS_PROGRAMS.Pattern_Programs;

// Logic 1 - Prints a pyramid with spaces before each star
public class StarPattern7 {
    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) { // Loop for each row (1 to 4)

            // Print spaces before stars in each row
            for (int j = 4; j >= i; j--) { // Decreasing number of spaces
                System.out.print(" ");
            }

            // Print stars with a space after each star
            for (int k = 1; k <= i; k++) { // Increasing stars in each row
                System.out.print("* "); // Space after '*' for proper pyramid shape
            }

            // Move to next line after finishing one row
            System.out.println();
        }
    }
}

// package CONTROL_STATEMENTS_PROGRAMS.Pattern_Programs;

// Logic 2 - Prints the same pyramid using if-else condition inside inner loop
// public class StarPattern7 {
// public static void main(String[] args) {

// for (int i = 1; i <= 4; i++) { // Loop for each row (1 to 4)

// for (int j = 4; j >= 1; j--) { // Loop for each column in the row
// if (j > i) {
// System.out.print(" "); // Print space if column index > row index
// } else {
// System.out.print(" *"); // Print star with space
// }
// }

// // Move to next line after finishing one row
// System.out.println();
// }
// }
// }
