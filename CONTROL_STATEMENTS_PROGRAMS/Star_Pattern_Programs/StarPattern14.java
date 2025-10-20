package CONTROL_STATEMENTS_PROGRAMS.Star_Pattern_Programs;

// ============================================
// Star Pattern 14
// ============================================
// This program prints an 'X' shaped pattern using stars (*)
//
// Example Output:
//
// *   *
//  * *
//   *
//  * *
// *   * 
//
// ============================================
// 🔍 Logic Explanation:
//
// → Outer loop (i): controls the number of rows (0 to 4)
// → Inner loop (j): controls the number of columns (0 to 4)
// → Condition:
//      if (i == j) → star on the **main diagonal** (top-left to bottom-right)
//      if (i + j == 5 - 1) → star on the **secondary diagonal** (top-right to bottom-left)
//      else → print space
// ============================================

public class StarPattern14 {
    public static void main(String[] args) {

        // Outer loop → runs for 5 rows
        for (int i = 0; i < 5; i++) {

            // Inner loop → runs for 5 columns
            for (int j = 0; j < 5; j++) {

                // Print star if it's on either diagonal
                if (i == j || i + j == 5 - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // Else, print space
                }
            }

            // Move to next line after one row is completed
            System.out.println();
        }
    }
}
