package CONTROL_STATEMENTS_PROGRAMS.Pattern_Programs;

public class StarPattern6 {
    public static void main(String[] args) {

        // Upper half of the pattern
        for (int i = 1; i <= 4; i++) { // Loop for number of rows (1 to 4)

            // Print spaces before stars
            for (int j = 3; j >= i; j--) { // Decreasing spaces
                System.out.print(" ");
            }

            // Print stars in increasing order
            for (int k = 1; k <= i; k++) { // Increasing stars
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = 1; i <= 4; i++) { // Loop for number of rows (1 to 4)

            // Print spaces before stars
            for (int j = 1; j <= i; j++) { // Increasing spaces
                System.out.print(" ");
            }

            // Print stars in decreasing order
            for (int k = 3; k >= i; k--) { // Decreasing stars
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
