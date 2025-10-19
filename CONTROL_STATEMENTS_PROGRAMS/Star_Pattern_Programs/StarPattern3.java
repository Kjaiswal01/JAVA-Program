package CONTROL_STATEMENTS_PROGRAMS.Star_Pattern_Programs;

public class StarPattern3 {
    public static void main(String[] args) {

        // ---------- Upper Half of the Pattern ----------
        // Prints an increasing triangle of stars
        for (int i = 1; i <= 4; i++) { // Controls the number of rows (1 to 4)
            for (int j = 1; j <= i; j++) { // Prints stars equal to the current row number
                System.out.print("*"); // Print star without moving to the next line
            }
            System.out.println(); // Move to the next line after each row
        }

        // ---------- Lower Half of the Pattern ----------
        // Prints a decreasing triangle of stars
        for (int i = 1; i <= 4; i++) { // Controls the number of rows (1 to 4)
            for (int j = 4; j >= i; j--) { // Prints decreasing number of stars each line
                System.out.print("*"); // Print star without moving to the next line
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
