package CONTROL_STATEMENTS_PROGRAMS.Numeric_Pattern_Programs;

// Pattern to print:
// 1 
// 2 3 
// 4 5 6 
// 7 8 9 10 

public class NumericPattern2 {
    public static void main(String[] args) {

        // 'count' variable will store the next number to print
        int count = 0;

        // Outer loop → controls number of rows (1 to 4)
        for (int i = 1; i <= 4; i++) {

            // Inner loop → prints numbers in each row
            // Each row has 'i' numbers
            for (int j = 1; j <= i; j++) {

                // Increment count by 1 each time before printing
                count = count + 1;

                // Print the current value of count with a space
                System.out.print(count + " ");
            }

            // After each row, move to the next line
            System.out.println();
        }
    }
}
