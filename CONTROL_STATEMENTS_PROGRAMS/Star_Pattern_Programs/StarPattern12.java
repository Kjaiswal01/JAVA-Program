package CONTROL_STATEMENTS_PROGRAMS.Star_Pattern_Programs;

// ============================================
// Star Pattern 12
// ============================================
// This program prints a **hollow inverted pyramid** pattern.
//
// Example Output:
//
// *********
//  *     *
//   *   *
//    * *
//     *
//
// ============================================
// 🔍 Logic Explanation:
//
// → Outer loop (i): controls the number of rows (from 5 to 1)
// → First inner loop (j): prints leading spaces before stars.
// → Second inner loop (k): prints stars (*) or spaces (" ")
//     - (i * 2) decides total width of each row
//     - Condition inside second loop:
//         if (k > 1 && k < (i * 2) - 1)
//             → print space (for hollow part)
//         else
//             → print star (border stars)
//
// As 'i' decreases, spaces increase and stars move closer to the center.
// ============================================

public class StarPattern12 {
    public static void main(String[] args) {

        // Outer loop → controls number of rows
        for (int i = 5; i >= 1; i--) {

            // 1️⃣ Print leading spaces before the stars
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // 2️⃣ Print stars and inner spaces (for hollow effect)
            for (int k = 1; k < (i * 2); k++) {

                // If not the first or last position → print space
                if (k > 1 && k < (i * 2) - 1) {
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
