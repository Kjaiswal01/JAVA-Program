package ARRAYS;

// =======================================
// PROGRAM: Print 1D Array using 'for-each' loop
// =======================================

// public class Array1D {
// public static void main(String[] args) {
// // Step 1️⃣: Declaration, Creation, and Initialization of Array
// int[] a = { 10, 20, 30, 40 };

// // Step 2️⃣: Printing array elements using enhanced 'for-each' loop
// // Syntax: for(dataType variableName : arrayName)
// // Here, 'i' will directly take the value of each element from 'a'
// for (int i : a) {
// // No need to use index 'a[i]'
// // 'i' already holds each element of array sequentially
// System.out.print(i + ",");
// }
// }
// }

// =======================================
// PROGRAM: Print 1D Array using 'for' loop
// =======================================

public class Array1D {
    public static void main(String[] args) {
        // Step 1️⃣: Declaration, Creation, and Initialization of Array
        // 'a' is an integer array with 4 elements
        int[] a = { 10, 20, 30, 40 };

        // Step 2️⃣: Printing array elements using 'for' loop
        // 'i' is the index variable → starts from 0 up to a.length - 1
        for (int i = 0; i < a.length; i++) {
            // a[i] → accesses the element at index 'i'
            // Print each element followed by a comma
            System.out.print(a[i] + ",");
        }
    }
}
