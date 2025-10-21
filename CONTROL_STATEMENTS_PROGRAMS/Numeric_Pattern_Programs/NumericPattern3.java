package CONTROL_STATEMENTS_PROGRAMS.Numeric_Pattern_Programs;

// Pattern to print:
// 1
// 2 1
// 3 2 1
// 4 3 2 1
// 5 4 3 2 1

public class NumericPattern3 {
    public static void main(String[] args) {

        // Outer loop controls the number of rows (1 to 5)
        for (int i = 1; i <= 5; i++) {

            // Inner loop prints numbers in reverse order for each row
            // For example, when i = 3 → prints 3 2 1
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " "); // print current number with space
            }

            // Move to next line after completing each row
            System.out.println();
        }
    }
}
