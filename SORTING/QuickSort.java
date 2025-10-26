// 📂 Package name
package SORTING;

// ✅ Class implementing QuickSort Algorithm
public class QuickSort {

    // =======================
    // 💡 MAIN METHOD
    // =======================
    public static void main(String[] args) {
        // Unsorted array
        int[] arr = { 15, 9, 7, 13, 12, 16, 4, 18, 0, 11 };
        int leng = arr.length;

        // Object creation to call instance methods
        QuickSort qsm = new QuickSort();

        // Function call to start sorting process
        qsm.quickSortRecursion(arr, 0, leng - 1);

        // Print the sorted array
        qsm.printArray(arr);
    }

    // =======================
    // ⚙️ PARTITION METHOD
    // =======================
    /*
     * The partition() method selects a pivot element and arranges all elements
     * such that:
     * - Elements smaller than pivot go to the left
     * - Elements greater than pivot go to the right
     * Returns the partition index where array is divided.
     */
    int partition(int[] arr, int low, int high) {
        // Choose pivot as the middle element
        int pivot = arr[(low + high) / 2];

        // Rearrange elements based on pivot
        while (low <= high) {
            // Move left index right until element >= pivot found
            while (arr[low] < pivot) {
                low++;
            }
            // Move right index left until element <= pivot found
            while (arr[high] > pivot) {
                high--;
            }
            // Swap elements if needed and move both pointers
            if (low <= high) {
                int temp = arr[low];
                arr[low] = arr[high];
                arr[high] = temp;
                low++;
                high--;
            }
        }
        // Return the partition index
        return low;
    }

    // =======================
    // 🔁 QUICK SORT RECURSION METHOD
    // =======================
    /*
     * The quickSortRecursion() method recursively divides
     * the array into subarrays based on partition index
     * until all elements are sorted.
     */
    void quickSortRecursion(int[] arr, int low, int high) {
        // Get partition index
        int pi = partition(arr, low, high);

        // Sort left half
        if (low < pi - 1) {
            quickSortRecursion(arr, low, pi - 1);
        }

        // Sort right half
        if (pi < high) {
            quickSortRecursion(arr, pi, high);
        }
    }

    // =======================
    // 🖨️ PRINT ARRAY METHOD
    // =======================
    /*
     * Simple utility method to print array elements
     */
    void printArray(int[] arr) {
        System.out.println("Sorted Array:");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
