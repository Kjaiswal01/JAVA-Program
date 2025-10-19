// package CONTROL_STATEMENTS_PROGRAMS.Pattern_Programs;

// // ============================================
// // Star Pattern 9 (Logic 1)
// // ============================================
// // This program prints an inverted pyramid of stars.
// // It uses four nested loops:
// //   1️⃣ First inner loop -> prints leading spaces.
// //   2️⃣ Second inner loop -> prints first half of stars.
// //   3️⃣ Third inner loop -> prints second half of stars.
// //   4️⃣ println() -> moves to the next line.
// // ============================================
// //
// // Expected Output:
// // ********
// //  ******
// //   ****
// //    **
// // ============================================

// public class StarPattern9 {

//     public static void main(String[] args) {

//         // Outer loop for total number of rows
//         for (int i = 1; i <= 4; i++) {

//             // 1️⃣ Loop for printing spaces
//             // As row increases, spaces also increase
//             for (int j = 1; j <= i; j++) {
//                 System.out.print(" ");
//             }

//             // 2️⃣ Loop for printing first half of stars
//             // Starts from 4 and decreases with each row
//             for (int k = 4; k >= i; k--) {
//                 System.out.print("*");
//             }

//             // 3️⃣ Loop for printing second half of stars
//             // One star less than the first half to make the pattern symmetric
//             for (int l = 3; l >= i; l--) {
//                 System.out.print("*");
//             }

//             // 4️⃣ Move to next line after completing one row
//             System.out.println();
//         }
//     }
// }

package CONTROL_STATEMENTS_PROGRAMS.Pattern_Programs;

// ============================================
// Star Pattern 9
// ============================================
// Logic 2: Inverted pyramid pattern of stars
// ============================================
//
// Expected Output:
// *********
//  *******
//   *****
//    ***
//     *
//
// Explanation:
// → Outer loop controls number of rows (5 rows).
// → First inner loop prints spaces before stars.
// → Second inner loop prints stars decreasing each row.
// ============================================

public class StarPattern9 {
    public static void main(String[] args) {

        // Outer loop for rows (starts from 5 and goes down to 1)
        for (int i = 5; i >= 1; i--) {

            // First inner loop: prints spaces before stars
            // As 'i' decreases, spaces increase
            for (int j = 5; j > i; j--) {
                System.out.print(" ");
            }

            // Second inner loop: prints stars
            // Formula (i*2 - 1) gives number of stars per row
            for (int k = 1; k < (i * 2); k++) {
                System.out.print("*");
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
