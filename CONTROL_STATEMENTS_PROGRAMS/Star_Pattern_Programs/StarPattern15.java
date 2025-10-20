package CONTROL_STATEMENTS_PROGRAMS.Star_Pattern_Programs;

// ============================================
// Star Pattern 15
// ============================================
// This program prints a **hollow square (box)** pattern of stars.
//
// Example Output:
//
// *****
// *   *
// *   *
// *   *
// *****
//
// ============================================
// 🔍 Logic Explanation:
//
// → Outer loop (i): controls the number of rows (1 to 5)
// → Inner loop (j): controls the number of columns (1 to 5)
// → Condition:
//      if (i >= 2 && j >= 2 && i <= 4 && j <= 4)
//          → print " " (space) for inner part (hollow center)
//      else
//          → print "*" for border part (edges)
// ============================================

public class StarPattern15 {
    public static void main(String[] args) {

        // Outer loop → controls number of rows
        for (int i = 1; i <= 5; i++) {

            // Inner loop → controls number of columns
            for (int j = 1; j <= 5; j++) {

                // Condition for hollow center
                // Rows 2–4 and Columns 2–4 → print space
                if (i >= 2 && j >= 2 && i <= 4 && j <= 4) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
