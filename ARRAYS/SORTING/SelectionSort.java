package SORTING;

// ============================================
// SELECTION SORT (Integer Array)
// ============================================
// Purpose: Array ko ascending order me sort karna
// Concept: Selection sort me har iteration me minimum element
// current index pe swap kiya jata hai
// Time Complexity: O(n^2), Space Complexity: O(1)
// ============================================

public class SelectionSort {

    public static void main(String[] args) {

        // 1D Integer Array declaration and initialization
        int[] a = { 38, 52, 9, 18, 6, 62, 13 };

        int min; // Variable to track index of minimum element
        int temp = 0; // Temporary variable for swapping elements

        // Outer loop → iterate through each element of the array
        for (int i = 0; i < a.length; i++) {

            min = i; // Assume current element is minimum

            // Inner loop → find the actual minimum element in unsorted part
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j; // Update min index if smaller element found
                }
            }

            // Swap the found minimum element with the first element of unsorted part
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }

        // Print sorted array
        System.out.print("Sorted Numbers: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

// package SORTING;

// // ============================================
// // SELECTION SORT (String Array)
// // ============================================
// // Purpose: String array ko lexicographical order me sort karna
// // Concept: Selection sort same logic follow karta hai, bas comparison
// // me string ke liye compareTo() method use hota hai
// // Time Complexity: O(n^2), Space Complexity: O(1)
// // ============================================

// public class SelectionSort {
// public static void main(String[] args) {

// // String array declaration and initialization
// String[] a = { "Deepak", "Vaibhav", "Varun", "Amit", "Rahul" };

// int min; // Index of minimum element
// String temp = ""; // Temporary variable for swapping strings

// // Outer loop → iterate through each string
// for (int i = 0; i < a.length; i++) {
// min = i; // Assume current string is minimum

// // Inner loop → find string which is smallest lexicographically
// for (int j = i + 1; j < a.length; j++) {
// if (a[j].compareTo(a[min]) < 0) {
// min = j; // Update min index if smaller string found
// }
// }

// // Swap the minimum string with the first unsorted string
// temp = a[i];
// a[i] = a[min];
// a[min] = temp;
// }

// // Print sorted string array
// System.out.print("Sorted Names: ");
// for (int i = 0; i < a.length; i++) {
// System.out.print(a[i] + " ");
// }
// }
// }
