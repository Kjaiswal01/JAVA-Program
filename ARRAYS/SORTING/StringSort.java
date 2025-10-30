// package SORTING;

// // ============================================
// // SELECTION SORT (String Array)
// // ============================================
// // Purpose: String array ko lexicographical order me sort karna
// // Concept: Selection sort same logic follow karta hai, bas comparison
// // me string ke liye compareTo() method use hota hai
// // Time Complexity: O(n^2), Space Complexity: O(1)
// // ============================================

// public class StringSort {
//     public static void main(String[] args) {

//         // String array declaration and initialization
//         String[] a = { "Deepak", "Vaibhav", "Varun", "Amit", "Rahul" };

//         int min; // Index of minimum element
//         String temp = ""; // Temporary variable for swapping strings

//         // Outer loop → iterate through each string
//         for (int i = 0; i < a.length; i++) {
//             min = i; // Assume current string is minimum

//             // Inner loop → find string which is smallest lexicographically
//             for (int j = i + 1; j < a.length; j++) {
//                 if (a[j].compareTo(a[min]) < 0) {
//                     min = j; // Update min index if smaller string found
//                 }
//             }

//             // Swap the minimum string with the first unsorted string
//             temp = a[i];
//             a[i] = a[min];
//             a[min] = temp;
//         }

//         // Print sorted string array
//         System.out.print("Sorted Names: ");
//         for (int i = 0; i < a.length; i++) {
//             System.out.print(a[i] + " ");
//         }
//     }
// }

package SORTING;

// =================================
// PROGRAM: Bubble Sort for Strings
// =================================

public class StringSort {
    public static void main(String[] args) {

        // Step 1: String array declare aur initialize karte hain
        // Yahan humne kuch names rakhe hain jo sort hone wale hain
        String[] a = { "Deepak", "Vaibhav", "Varun", "Amit", "Rahul" };

        // Temporary variable — swap ke time par ek string ko temporarily hold karega
        String temp;

        // Outer loop — har iteration ke baad ek largest string end me chali jaati hai
        for (int i = 0; i < a.length; i++) {

            // Flag — check karne ke liye ki koi swap hua ya nahi
            // Agar koi swap nahi hota to array already sorted hai
            int flag = 0;

            // Inner loop — adjacent strings compare karte hain
            // Har pass me ek element apni correct position par pahunchta hai
            // Isliye har pass ke baad comparison range reduce hoti hai (a.length - 1 - i)
            for (int j = 0; j < a.length - 1 - i; j++) {

                // compareTo() method:
                // a[j].compareTo(a[j + 1]) > 0 => a[j] alphabetically bada hai a[j+1] se
                // a[j].compareTo(a[j + 1]) < 0 => a[j] chhota hai a[j+1] se
                // a[j].compareTo(a[j + 1]) == 0 => dono equal hain
                if (a[j].compareTo(a[j + 1]) > 0) {

                    // Swap karte hain dono adjacent strings ko
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;

                    // Swap hua hai to flag ko 1 kar dete hain
                    flag = 1;
                }
            }

            // Agar poore inner loop me koi swap nahi hua (flag = 0),
            // iska matlab array already sorted hai → loop break kar do
            if (flag == 0) {
                break;
            }
        }

        // Step 3: Final sorted array print karna
        System.out.print("Sorted Names: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
