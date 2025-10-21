package CONTROL_STATEMENTS_PROGRAMS.Numeric_Pattern_Programs;

// ============================================
// Numeric Pattern 6
// ============================================
// This program prints the following pattern:
//
// 1
// 2 6
// 3 7 10
// 4 8 11 13
// 5 9 12 14 15
//
// ============================================
// Logic Explanation:
// → Outer loop (i): controls the number of rows (1 to 5)
// → Inner loop (j): prints numbers in each row
// → 'no' variable: stores the current number to print
// → 'no' is updated after each print as:
//       no = no + (5 - j)
//   This formula generates the pattern incrementally.
// ============================================

public class NumericPattern6 {
    public static void main(String[] args) {

        // Outer loop → controls the rows
        for (int i = 1; i <= 5; i++) {

            // Initialize starting number for the row
            int no = i;

            // Inner loop → prints numbers in each row
            for (int j = 1; j <= i; j++) {

                System.out.print(no + " "); // print current number

                // Update number for next column in the same row
                no = no + 5 - j;
            }

            // Move to next line after finishing the row
            System.out.println();
        }
    }
}
