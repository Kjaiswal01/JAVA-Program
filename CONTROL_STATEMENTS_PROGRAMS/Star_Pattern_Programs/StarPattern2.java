package CONTROL_STATEMENTS_PROGRAMS.Star_Pattern_Programs;

public class StarPattern2 {
    public static void main(String[] args) {

        // Outer loop controls the number of rows (4 rows total)
        for (int i = 1; i <= 4; i++) {

            // Inner loop prints stars in each row
            // It starts from 4 and goes down to i
            // So, number of stars decreases each line
            for (int j = 4; j >= i; j--) {
                System.out.print("*"); // Print star without moving to the next line
            }

            System.out.println(); // Move to the next line after each row
        }
    }
}
