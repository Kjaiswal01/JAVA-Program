package CONTROL_STATEMENTS_PROGRAMS.Looping_Problems;

public class FibonacciSeries {
    public static void main(String[] args) {

        // Initialize first two Fibonacci numbers
        int a = 0, b = 1;

        // Print starting numbers
        System.out.println(a + " " + b);

        int c; // to store next number

        // Generate next 10 Fibonacci numbers
        for (int i = 1; i <= 10; i++) {
            c = a + b; // next number = sum of previous two
            System.out.println(c);
            a = b; // move forward in series
            b = c;
        }
    }
}
