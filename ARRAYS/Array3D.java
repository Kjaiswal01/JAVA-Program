package ARRAYS;
// Yeh line batati hai ki yeh class 'ARRAYS' package ke andar hai.

public class Array3D {
    // Class declaration: 'Array3D' naam ki public class banai gayi hai.

    public static void main(String[] args) {
        // Main method: Program execution yahaan se start hoti hai.

        int[][][] a = { { { 10, 20 }, { 30, 40, 50, 60 }, { 70, 80, 90 } } };
        /*
         * Yeh ek 3D array hai jiska structure kuch aisa hai:
         * 
         * a = {
         * { // 1st 2D array
         * {10, 20}, // 1st row of 1st 2D array
         * {30, 40, 50, 60}, // 2nd row
         * {70, 80, 90} // 3rd row
         * }
         * };
         * 
         * Basically 3D array = array of 2D arrays.
         */

        System.out.println(a);
        // Yeh line array 'a' ka reference print karegi (memory address jaisa output),
        // actual values nahi dikhengi. Eg: [[[I@3fee733d

        for (int i = 0; i < a.length; i++) {
            // i loop: har ek 2D array ko access karta hai

            for (int j = 0; j < a[i].length; j++) {
                // j loop: har ek 2D array ke andar ke 1D arrays ko access karta hai

                for (int k = 0; k < a[i][j].length; k++) {
                    // k loop: har ek 1D array ke andar ke elements ko access karta hai

                    System.out.print(a[i][j][k] + " ");
                    // 3D array ke elements ko ek ek karke print karta hai
                }
                System.out.println();
                // Har 1D array print hone ke baad new line deta hai
            }
        }
    }
}
