package CONTROL_STATEMENTS_PROGRAMS.Looping_Problems;

import java.util.*;

public class PrintFactorialRecursion {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int no = s.nextInt();

        PrintFactorialRecursion ob = new PrintFactorialRecursion();
        int fact = ob.calFact(no);
        System.out.println("Factorial of " + no + " is = " + fact);
    }

    int calFact(int no) {
        if (no <= 1) { // ✅ Base condition
            return 1;
        } else {
            return no * calFact(no - 1); // ✅ Recursive call
        }
    }
}
