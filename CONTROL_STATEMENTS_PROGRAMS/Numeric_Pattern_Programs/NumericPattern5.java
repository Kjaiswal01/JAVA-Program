package CONTROL_STATEMENTS_PROGRAMS.Numeric_Pattern_Programs;

// ============================================
// Numeric Pattern 5
// ============================================
// This program prints a **decreasing number triangle** pattern.
//
// Expected Output:
//
// 5 4 3 2 1
// 5 4 3 2
// 5 4 3
// 5 4
// 5
//
// ============================================
// Logic Explanation:
// → Outer loop (i): controls the rows (1 to 5)
// → Inner loop (j): prints numbers starting from 5 down to i
// → Each row starts from 5 and ends at i
// ============================================

public class NumericPattern5 {
    public static void main(String[] args) {

        // Outer loop → controls number of rows
        for (int i = 1; i <= 5; i++) {

            // Inner loop → prints numbers from 5 down to current row number i
            // Example:
            // Row 1 → 5 4 3 2 1
            // Row 2 → 5 4 3 2
            for (int j = 5; j >= i; j--) {
                System.out.print(j + " "); // print number with space
            }

            // Move to next line after completing one row
            System.out.println();
        }
    }
}
