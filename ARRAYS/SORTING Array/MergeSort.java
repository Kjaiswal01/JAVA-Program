package ARRAYS.SORTING;

// ==============================
// TOPIC: MERGE SORT
// ==============================
// Merge Sort is a Divide and Conquer algorithm.
// It divides the array into two halves, sorts them recursively,
// and then merges the sorted halves back together.
// ================================================

class MergeSort {

    int[] array; // Original array
    int[] tempMergeArr; // Temporary array used during merging
    int length; // Size of array

    // -----------------------------
    // MAIN METHOD (Program starts)
    // -----------------------------
    public static void main(String[] args) {
        int[] inputArr = { 48, 36, 13, 52, 91, 19, 21 }; // Unsorted input array

        MergeSort ms = new MergeSort(); // Create object of MergeSort class
        ms.sort(inputArr); // Call sort() to sort the array

        // Print the sorted array
        System.out.println("Sorted Array:");
        for (int i : inputArr) {
            System.out.print(i + " ");
        }
    }

    // -----------------------------
    // METHOD 1: sort()
    // -----------------------------
    // Initializes variables and starts the recursive process.
    public void sort(int inputArr[]) {
        this.array = inputArr;
        this.length = inputArr.length;
        this.tempMergeArr = new int[length];
        divideArray(0, length - 1); // Call recursive function to divide array
    }

    // -----------------------------
    // METHOD 2: divideArray()
    // -----------------------------
    // Divides the array into two halves recursively until single element remains.
    // lowerIndex = starting index, higherIndex = ending index
    public void divideArray(int lowerIndex, int higherIndex) {
        if (lowerIndex < higherIndex) {
            int middle = lowerIndex + (higherIndex - lowerIndex) / 2;

            // Recursively divide left half
            divideArray(lowerIndex, middle);

            // Recursively divide right half
            divideArray(middle + 1, higherIndex);

            // Merge the two halves
            mergeArray(lowerIndex, middle, higherIndex);
        }
    }

    // -----------------------------
    // METHOD 3: mergeArray()
    // -----------------------------
    // Merges two sorted halves of the array.
    // Left half: lowerIndex → middle
    // Right half: middle+1 → higherIndex
    public void mergeArray(int lowerIndex, int middle, int higherIndex) {

        // Copy elements into temporary array
        for (int i = lowerIndex; i <= higherIndex; i++) {
            tempMergeArr[i] = array[i];
        }

        int i = lowerIndex; // Pointer for left half
        int j = middle + 1; // Pointer for right half
        int k = lowerIndex; // Pointer for final sorted position

        // Compare elements of both halves and put smaller one into main array
        while (i <= middle && j <= higherIndex) {
            if (tempMergeArr[i] <= tempMergeArr[j]) {
                array[k] = tempMergeArr[i];
                i++;
            } else {
                array[k] = tempMergeArr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of left half (if any)
        while (i <= middle) {
            array[k] = tempMergeArr[i];
            k++;
            i++;
        }

        // No need to copy right half because it’s already in correct place
    }
}

// Time Complexity:
// Best Case = O(n log n)
// Average Case = O(n log n)
// Worst Case = O(n log n)

// Space Complexity

// Extra space is used for tempMergeArr[] (temporary array).
// → Space Complexity = O(n)