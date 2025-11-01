// Package name
package ARRAYS.SORTING;

// Class definition
public class HeapSort {
    public static void main(String[] args) {
        // Input array
        int[] arr = { 22, 13, 17, 11, 10, 14, 12 };

        // Create object of HeapSort class
        HeapSort hs = new HeapSort();

        // Sort the array using heapsort
        hs.sort(arr);

        // Print the sorted array
        hs.printArray(arr);
    }

    // -------------------- SORT FUNCTION --------------------
    void sort(int[] arr) {
        int leng = arr.length;

        // STEP 1: Build Max Heap from the array
        // (Start from last non-leaf node and heapify each node)
        for (int i = leng / 2 - 1; i >= 0; i--) {
            heapify(arr, leng, i);
        }

        // STEP 2: Extract elements one by one from heap
        // and move the largest element (root) to end of array
        for (int i = leng - 1; i >= 0; i--) {
            // Swap current root (maximum) with last element
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }

    // -------------------- HEAPIFY FUNCTION --------------------
    // Converts subtree rooted at index i into a Max Heap
    void heapify(int[] arr, int n, int i) {
        int largest = i; // Assume parent (i) is largest
        int li = 2 * i + 1; // Left child index
        int ri = 2 * i + 2; // Right child index

        // If left child exists and is greater than parent
        if (li < n && arr[li] > arr[largest]) {
            largest = li;
        }

        // If right child exists and is greater than current largest
        if (ri < n && arr[ri] > arr[largest]) {
            largest = ri;
        }

        // If largest is not the parent, swap and heapify again
        if (largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, n, largest);
        }
    }

    // -------------------- PRINT FUNCTION --------------------
    // Prints the elements of array
    void printArray(int[] arr) {
        System.out.print("Sorted Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
