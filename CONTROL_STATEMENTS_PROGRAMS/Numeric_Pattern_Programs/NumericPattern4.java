package CONTROL_STATEMENTS_PROGRAMS.Numeric_Pattern_Programs;

// Pattern to print:
// 1 
// 1 2 1
// 1 2 3 2 1
// 1 2 3 4 3 2 1
// 1 2 3 4 5 4 3 2 1

public class NumericPattern4 {
    public static void main(String[] args) {

        // Outer loop → controls the number of rows (1 to 5)
        for (int i = 1; i <= 5; i++) {

            // First inner loop → prints increasing numbers from 1 up to i
            // Example:
            // when i = 3 → prints 1 2 3
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            // Second inner loop → prints decreasing numbers from i down to 1
            // Example:
            // when i = 3 → prints 3 2 1
            for (int k = i - 1; k >= 1; k--) {
                System.out.print(k + " ");
            }

            // Move to next line after completing one full row
            System.out.println();
        }
    }
}
