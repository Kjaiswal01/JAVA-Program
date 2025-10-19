package CONTROL_STATEMENTS_PROGRAMS.Star_Pattern_Programs;

public class StarPattern1 {
    public static void main(String[] args) {

        // Outer loop -> controls the number of rows (here, 4 rows)
        for (int i = 1; i <= 4; i++) {

            // Inner loop -> prints stars (*) in each row
            // The number of stars in each row = current row number (i)
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // prints star without moving to next line
            }

            // Moves to next line after printing stars of one row
            System.out.println();
        }
    }
}
