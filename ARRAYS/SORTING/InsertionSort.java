package ARRAYS.SORTING;

public class InsertionSort {

    public static void main(String[] args) {

        // ============================================
        // STEP 1: Initialize the array to be sorted
        // ============================================
        int[] a = { 5, 1, 6, 2, 4, 3, 0 };
        // Array me elements unordered hain
        // Goal: Sort array in ascending order using Insertion Sort

        // ============================================
        // STEP 2: Start Insertion Sort Algorithm
        // ============================================
        int temp, j;

        // Outer loop → i starts from 1, because first element (index 0) is considered
        // sorted
        for (int i = 1; i < a.length; i++) {

            temp = a[i]; // Store current element in temp
            j = i; // Initialize j to i, used for comparing with sorted part

            // ============================================
            // Inner loop → Shift elements of sorted part
            // ============================================
            while (j > 0 && a[j - 1] > temp) {
                // Compare temp with elements in sorted portion (left side)
                // If element is greater than temp, shift it one position to the right
                a[j] = a[j - 1];
                j = j - 1; // Move j one position left
            }

            // Place temp at correct position after shifting
            a[j] = temp;
        }

        // ============================================
        // STEP 3: Print the sorted array
        // ============================================
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " "); // Print each element of sorted array
        }

        // Output will be: 0 1 2 3 4 5 6
    }
}
