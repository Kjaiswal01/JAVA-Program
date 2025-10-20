package CONTROL_STATEMENTS_PROGRAMS.Star_Pattern_Programs;

// ============================================
// Star Pattern 13
// ============================================
// This program prints a **hollow pyramid (triangle)** pattern.
//
// Example Output:
//
//     *
//    * *
//   *   *
//  *     *
// *       *
//
// ============================================
// 🔍 Logic Explanation:
//
// → Outer loop (i): controls total number of rows (1 to 5)
// → First inner loop (j): prints leading spaces before the stars
//      → As 'i' increases, spaces decrease → pyramid shape.
// → Second inner loop (k): prints either a star or a space
//      → (i * 2) controls total width of each row
//      → Condition:
//          if (k > 1 && k < (i * 2) - 1)
//              → print space (hollow part)
//          else
//              → print star (border part)
// ============================================

public class StarPattern13 {
    public static void main(String[] args) {

        // Outer loop → controls the number of rows
        for (int i = 1; i <= 5; i++) {

            // 1️⃣ Print leading spaces before stars
            // As i increases, spaces decrease → center alignment
            for (int j = 5; j >= i; j--) {
                System.out.print(" ");
            }

            // 2️⃣ Print stars or spaces for the hollow pyramid
            for (int k = 1; k < (i * 2); k++) {

                // If it's not the first or last star in the row → print space
                if (k > 1 && k < (i * 2) - 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            // 3️⃣ Move to next line after finishing one row
            System.out.println();
        }
    }
}
