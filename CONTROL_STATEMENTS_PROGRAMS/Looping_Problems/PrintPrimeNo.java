package CONTROL_STATEMENTS_PROGRAMS.Looping_Problems;

public class PrintPrimeNo {
    public static void main(String[] args) {
        int temp = 0; // counter to check divfisibility

        // loop through numbers from 1 to 100
        for (int no = 1; no <= 100; no++) {

            // check if 'no' is divisible by any number between 2 and no-1
            for (int i = 2; i <= no - 1; i++) {
                if (no % i == 0) { // if divisible, not prime
                    temp = temp + 1;
                }
            }

            // after checking all divisors
            if (temp == 0) { // if no divisors found → prime
                System.out.println(no);
            } else { // reset temp for next number
                temp = 0;
            }
        }
    }
}
