package CONTROL_STATEMENTS_PROGRAMS.Star_Pattern_Programs;

// ============================================
// Star Pattern 10
// ============================================
// This program prints a pattern of stars in the form of
// a *right-angled triangle with a hollow effect*.
//
// Expected Output:
//    *
//   * 
//  *  
// *   
//
// ============================================

public class StarPattern10 {
    public static void main(String[] args) {

        // Outer loop → controls total number of rows
        for (int i = 1; i <= 4; i++) {

            // 1️⃣ Inner loop for printing spaces before stars
            // Spaces decrease as 'i' increases
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }

            // 2️⃣ Inner loop for printing stars and inner spaces
            for (int k = 1; k <= i; k++) {

                // Condition:
                // If row number (i) >= 2 and column (k) > 1,
                // then print space instead of star.
                // → This creates the hollow effect.
                if (i >= 2 && k > 1) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            // Move to next line after each row
            System.out.println();
        }
    }
}
