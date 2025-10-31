package ARRAYS.SORTING;

// ================================
// PROGRAM: Bubble Sort for Numbers
// ================================

public class BubbleSort {
    public static void main(String[] args) {
        // Step 1: Array declare aur initialize karte hain
        int[] a = { 36, 19, 29, 12, 5 };

        // Temporary variable swap ke liye
        int temp;

        // Outer loop — total passes ke liye
        // Har pass me sabse bada element end me chala jata hai
        for (int i = 0; i < a.length; i++) {

            // Flag use hota hai check karne ke liye ki koi swap hua ya nahi
            int flag = 0;

            // Inner loop — actual comparison aur swapping
            // '-i' isliye likha hai kyunki last ke i elements already sorted ho jate hain
            for (int j = 0; j < a.length - 1 - i; j++) {

                // Agar current element next se bada hai, to swap karenge
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    // Swap hua hai to flag = 1
                    flag = 1;
                }
            }

            // Agar ek bhi swap nahi hua (flag == 0)
            // matlab array already sorted hai → break kar do (optimization)
            if (flag == 0) {
                break;
            }
        }

        // Final sorted array print karna
        System.out.print("Sorted Numbers: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}

// package SORTING;

// // =================================
// // PROGRAM: Bubble Sort for Strings
// // =================================

// public class BubbleSort {
// public static void main(String[] args) {

// // Step 1: String array declare aur initialize karte hain
// String[] a = { "Deepak", "Vaibhav", "Varun", "Amit", "Rahul" };

// // Temporary variable string swap ke liye
// String temp;

// // Outer loop — har pass me ek element apni correct position par pahunchta
// hai
// for (int i = 0; i < a.length; i++) {

// // Flag to check if any swap happened
// int flag = 0;

// // Inner loop — string comparison aur swapping
// // a.length - 1 - i → har pass ke baad ek element sort ho jata hai
// for (int j = 0; j < a.length - 1 - i; j++) {

// // compareTo() method:
// // Returns +ve → agar a[j] alphabetically bada hai a[j+1] se
// // Returns -ve → agar a[j] chhota hai
// // Returns 0 → agar equal hai
// if (a[j].compareTo(a[j + 1]) > 0) {

// // Swap karte hain dono strings
// temp = a[j];
// a[j] = a[j + 1];
// a[j + 1] = temp;

// // Swap hua hai to flag = 1
// flag = 1;
// }
// }

// // Agar koi swap nahi hua to array already sorted hai
// if (flag == 0) {
// break;
// }
// }

// // Final sorted string array print karna
// System.out.print("Sorted Names: ");
// for (int i = 0; i < a.length; i++) {
// System.out.print(a[i] + " ");
// }
// }
// }
