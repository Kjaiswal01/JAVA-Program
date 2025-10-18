package CONTROL_STATEMENTS_PROGRAMS.Pattern_Programs;

public class StarPattern4 {
    public static void main(String[] args) {

        // Outer loop controls number of rows
        for (int i = 1; i <= 4; i++) {

            // Inner loop 1: prints spaces before stars
            for (int j = 4; j >= i; j--) {
                System.out.print(" "); // print space (not println)
            }

            // Inner loop 2: prints stars
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }

            System.out.println(); // move to next line after each row
        }
    }
}
