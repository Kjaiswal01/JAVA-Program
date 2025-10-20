package CONTROL_STATEMENTS_PROGRAMS.Star_Pattern_Programs;

// ============================================
// Star Pattern 11
// ============================================
// This program prints a right-angled triangle pattern
// where each row has one star (*) at the end, forming
// a diagonal pattern like this:
//
// *
//  *
//   *
//    *
// ============================================
//
// Logic Explanation:
// → Outer loop controls the number of rows (4).
// → Inner loop prints spaces and stars based on a condition:
//     - If (i >= 2 && j <= i - 1): print space.
//     - Else: print star (*).
//   This means: print space until the last column of each row,
//   then print one star at the end.
// ============================================

public class StarPattern11 {
    public static void main(String[] args) {

        // Outer loop → controls the number of rows
        for (int i = 1; i <= 4; i++) {

            // Inner loop → prints spaces or star in each row
            for (int j = 1; j <= i; j++) {

                // Condition:
                // For row 2 onwards, print spaces for (i-1) columns,
                // and print '*' at the last column.
                if (i >= 2 && j <= i - 1) {
                    System.out.print(" "); // print spaces
                } else {
                    System.out.print("*"); // print star at the end
                }
            }

            // Move to next line after completing one row
            System.out.println();
        }
    }
}
