package CONTROL_STATEMENTS_PROGRAMS.Star_Pattern_Programs;

public class StarPattern5 {
    public static void main(String[] args) {

        // Outer loop for number of rows
        for (int i = 1; i <= 4; i++) {

            // Print spaces before stars
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }

            // Print stars after spaces
            for (int k = 4; k >= i; k--) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
