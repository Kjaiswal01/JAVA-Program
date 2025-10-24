package ARRAYS;
// Yeh line batati hai ki yeh class 'ARRAYS' package ke andar hai.

public class AnonymousArray {
    // Class declaration: 'AnonymousArray' naam ki public class banai gayi hai.

    public static void main(String[] args) {
        /*
         * Yahaan hum "anonymous array" use kar rahe hain.
         * 
         * Anonymous array ka matlab hota hai — ek aisa array jiska koi naam nahi hota,
         * aur use sirf ek hi baar ke liye directly method call mein pass kar dete hain.
         * 
         * Syntax: methodName(new int[][] { { values }, { values } });
         */
        AnonymousArray.sum(new int[][] { { 10, 20, 30 }, { 40, 50 } });
        /*
         * Yahaan hum 'sum' method ko call kar rahe hain aur ek 2D anonymous array pass
         * kar rahe hain.
         * 
         * 2D array structure:
         * {
         * {10, 20, 30},
         * {40, 50}
         * }
         * 
         * Iska koi variable name nahi hai, directly method ke andar pass ho gaya.
         */
    }

    static void sum(int[][] no) {
        // Yeh static method hai jo 2D int array ko input ke roop mein accept karta hai.

        int total = 0;
        // Total sum store karne ke liye variable.

        for (int ii[] : no) {
            /*
             * Enhanced for loop (for-each loop)
             * 'no' array ke andar jitne bhi 1D arrays (rows) hain, unko ek-ek karke access
             * karega.
             * 
             * Example:
             * ii = {10, 20, 30} in first iteration
             * ii = {40, 50} in second iteration
             */

            for (int i : ii) {
                // Har 1D array ke andar ke elements ko access karta hai
                total = total + i;
                // Sabhi elements ko add karta hai
            }
        }

        System.out.println("Sum is : " + total);
        // Final total sum print karta hai
    }
}
