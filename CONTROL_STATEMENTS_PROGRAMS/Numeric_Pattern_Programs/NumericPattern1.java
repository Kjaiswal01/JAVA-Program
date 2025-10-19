package CONTROL_STATEMENTS_PROGRAMS.Numeric_Pattern_Programs;

// ============================================
// NUMERIC PATTERN PROGRAMS
// ============================================
//
// Pattern 1:
// 1
// 22
// 333
// 4444
//
// Pattern 2:
// 1
// 12
// 123
// 1234
//
// ============================================
// Explanation:
// → Both programs use nested loops.
// → Outer loop (i): controls the number of rows.
// → Inner loop (j): controls what to print in each row.
// ============================================

// Uncomment this block to print Pattern 1
/*
public class NumericPattern1 {
    public static void main(String[] args) {
        // Outer loop for rows (1 to 4)
        for (int i = 1; i <= 4; i++) {
            // Inner loop for printing 'i' times
            for (int j = 1; j <= i; j++) {
                System.out.print(i); // prints the same number in one row
            }
            System.out.println(); // move to the next line
        }
    }
}
*/

// ---------------------------------------------

// Active block: prints Pattern 2
public class NumericPattern1 {
    public static void main(String[] args) {

        // Outer loop → controls number of rows (1 to 4)
        for (int i = 1; i <= 4; i++) {

            // Inner loop → prints increasing sequence from 1 to i
            for (int j = 1; j <= i; j++) {
                System.out.print(j); // prints current column number
            }

            // Move to next line after completing one row
            System.out.println();
        }
    }
}
