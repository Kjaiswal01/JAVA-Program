package CONTROL_STATEMENTS_PROGRAMS;

// Demonstrates swapping of two numbers
// 1) Without using a third variable
// 2) Using a third variable

public class SwapTwoNum {

    // Method 1: Swap without using a third variable
    public static void swapWithoutTemp(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Swapping using arithmetic
        a = a + b; // Step 1: sum a and b
        b = a - b; // Step 2: get original value of a in b
        a = a - b; // Step 3: get original value of b in a

        System.out.println("After Swap (without temp): a = " + a + ", b = " + b);
        System.out.println("--------------------------------------------------");
    }

    // Method 2: Swap using a third variable
    public static void swapWithTemp(int a, int b) {
        System.out.println("Before Swap: a = " + a + ", b = " + b);

        int temp = a; // Store a in temporary variable
        a = b; // Assign b to a
        b = temp; // Assign temp (original a) to b

        System.out.println("After Swap (with temp): a = " + a + ", b = " + b);
        System.out.println("--------------------------------------------------");
    }

    // Main method
    public static void main(String[] args) {
        int num1 = 990;
        int num2 = 999;

        swapWithoutTemp(num1, num2); // Call method 1
        swapWithTemp(num1, num2); // Call method 2
    }
}
