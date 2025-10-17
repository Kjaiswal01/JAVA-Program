package CONTROL_STATEMENTS_PROGRAMS.Looping_Problems;

import java.util.Scanner;

public class AmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Take input number
        System.out.print("Enter the Number: ");
        int no = s.nextInt();

        int t1 = no;
        int leng = 0;

        // Step 1: Count digits
        while (t1 != 0) {
            leng++;
            t1 = t1 / 10;
        }

        int t2 = no;
        int arm = 0;

        // Step 2: Calculate sum of digits raised to 'length'
        while (t2 != 0) {
            int rem = t2 % 10;
            int mul = 1;

            // Multiply rem 'leng' times (rem^leng)
            for (int i = 1; i <= leng; i++) {
                mul *= rem;
            }

            arm += mul;
            t2 = t2 / 10;
        }

        // Step 3: Check Armstrong condition
        if (arm == no)
            System.out.println(no + " is an Armstrong number");
        else
            System.out.println(no + " is not an Armstrong number");

        s.close();
    }
}
