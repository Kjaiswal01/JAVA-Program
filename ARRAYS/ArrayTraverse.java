package ARRAYS;

// ============================================
// 1D ARRAY TRAVERSAL USING FOR LOOP
// ============================================

public class ArrayTraverse {

    public static void main(String[] args) {

        // Declaration and Initialization of 1D array
        int[] a = { 10, 20, 30 };

        // Standard for loop — used to traverse through array indices
        for (int i = 0; i < a.length; i++) {
            // Accessing each element using index 'i'
            System.out.print(a[i] + " ");
        }

        // Output: 10 20 30
    }
}

// ============================================
// 2D ARRAY TRAVERSAL USING NESTED FOR LOOP
// ============================================

// public class ArrayTraverse {
// public static void main(String[] args) {
// // 2D Array Declaration and Initialization
// int[][] a = { { 10, 20 }, { 30, 40, 50 } };

// // Outer loop → for rows
// for (int i = 0; i < a.length; i++) {

// // Inner loop → for columns of each row
// for (int j = 0; j < a[i].length; j++) {
// System.out.print(a[i][j] + " ");
// }

// // Move to next line after each row
// System.out.println();
// }
// // Output:
// // 10 20
// // 30 40 50
// }
// }

// ============================================
// 3D ARRAY TRAVERSAL USING TRIPLE NESTED LOOP
// ============================================

// public class ArrayTraverse {
// public static void main(String[] args) {
// // 3D array declaration and initialization
// int[][][] a = {
// { { 10, 20 }, { 30, 40, 50 } },
// { { 60, 70, 80 }, { 90, 100 } }
// };

// // Outer loop → for 1st dimension (blocks)
// for (int i = 0; i < a.length; i++) {

// // Middle loop → for 2nd dimension (rows)
// for (int j = 0; j < a[i].length; j++) {

// // Inner loop → for 3rd dimension (columns)
// for (int k = 0; k < a[i][j].length; k++) {
// System.out.print(a[i][j][k] + " ");
// }
// System.out.println();
// }
// System.out.println(); // line break between blocks
// }
// }
// }

// ============================================
// TRAVERSING 1D ARRAY USING FOR-EACH LOOP
// ============================================

// public class ArrayTraverse {

// public static void main(String[] args) {
// int[] a = { 10, 20, 30 };

// // Enhanced for loop (for-each)
// for (int i : a) {
// System.out.print(i + " ");
// }

// // Output: 10 20 30
// }
// }

// ============================================
// TRAVERSING ARRAY USING WHILE LOOP
// ============================================

// public class ArrayTraverse {

// public static void main(String[] args) {
// int[] a = { 10, 20, 30 };
// int i = 0; // Initialization

// // Condition check before entering loop
// while (i < a.length) {
// System.out.print(a[i] + " ");
// i++; // Increment
// }
// }
// }

// ============================================
// TRAVERSING ARRAY USING DO-WHILE LOOP
// ============================================

// public class ArrayTraverse {

// public static void main(String[] args) {
// int[] a = { 10, 20, 30 };
// int i = 0; // Initialization

// // Do-while executes body at least once even if condition is false
// do {
// System.out.print(a[i] + " ");
// i++;
// } while (i < a.length); // Condition checked after loop body
// }
// }
