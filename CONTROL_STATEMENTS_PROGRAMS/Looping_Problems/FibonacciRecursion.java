package CONTROL_STATEMENTS_PROGRAMS.Looping_Problems;

public class FibonacciRecursion {
    // Initial two numbers of Fibonacci series
    static int a = 0, b = 1, c;

    public static void main(String[] args) {
        System.out.print(a + " " + b); // print first two numbers
        FibonacciRecursion ob = new FibonacciRecursion();
        ob.printFib(10); // print next 10 Fibonacci numbers
    }

    // Recursive function to print Fibonacci series
    void printFib(int i) {
        if (i >= 1) { // base condition
            c = a + b; // next number = sum of previous two
            System.out.print(" " + c);
            a = b; // shift values for next call
            b = c;
            printFib(i - 1); // recursive call
        }
    }
}
