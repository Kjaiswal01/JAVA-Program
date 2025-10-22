package CONTROL_STATEMENTS_PROGRAMS.Numeric_Pattern_Programs;

// ============================================
// Numeric Pattern 7
// ============================================
// This program prints consecutive numbers in a rectangular grid pattern
//
// Expected Output:
//
// 1 2 3
// 4 5 6
// 7 8 9
// 10 11 12
// 13 14 15
//
// ============================================
// Logic Explanation:
// → 'count' variable keeps track of the current number to print
// → Outer loop (i): controls the number of rows (1 to 5)
// → Inner loop (j): controls the number of columns (1 to 3)
// → Increment 'count' in each iteration and print it
// ============================================

// public class NumericPattern7 {
//     public static void main(String[] args) {

//         int count = 0; // Initialize the counter

//         // Outer loop → controls number of rows
//         for (int i = 1; i <= 5; i++) {

//             // Inner loop → controls number of columns (3 columns)
//             for (int j = 1; j <= 3; j++) {
//                 count = count + 1; // Increment the counter
//                 System.out.print(count + " "); // Print the current number with space
//             }

//             // Move to next line after printing one row
//             System.out.println();
//         }
//     }
// }

// package CONTROL_STATEMENTS_PROGRAMS.Numeric_Pattern_Programs;

// ============================================
// Numeric Pattern 7 - Zig-Zag Pattern
// ============================================
// This program prints numbers in a "zig-zag" manner:
//
// Row 1 → 1 2 3
// Row 2 → 6 5 4
// Row 3 → 7 8 9
// Row 4 → 12 11 10
// Row 5 → 13 14 15
//
// ============================================
// Logic Explanation:
// → 'count' variable keeps track of the last printed number
// → Outer loop (i) → controls rows
// → Odd rows → print numbers in increasing order
// → Even rows → print numbers in decreasing order using a temporary variable
// → For even rows, calculate the start and end numbers and then print in reverse
// ============================================

public class NumericPattern7 {
    public static void main(String[] args) {

        int count = 0; // Keeps track of numbers printed so far

        // Outer loop → for rows (1 to 5)
        for (int i = 1; i <= 5; i++) {

            if (i % 2 != 0) {
                // Odd row → print numbers in increasing order
                for (int j = 1; j <= 3; j++) {
                    count = count + 1;
                    System.out.print(count + " "); // Print number with space
                }
            } else {
                // Even row → print numbers in decreasing order
                int temp = count + 1; // First number for this row
                for (int j = count + 3; j >= temp; j--) {
                    count = count + 1; // Update count for next rows
                    System.out.print(j + " "); // Print numbers in reverse
                }
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
