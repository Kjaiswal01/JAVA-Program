package CONTROL_STATEMENTS_PROGRAMS.Looping_Problems;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Kshitij"; // Original string
        int leng = name.length(); // Get length of string
        String rev = ""; // Empty string to store reverse

        // Loop from last character to first
        for (int i = leng - 1; i >= 0; i--) {
            rev = rev + name.charAt(i); // Add each char in reverse order
        }

        // Print result
        System.out.println("Reverse of " + name + " is " + rev);
    }
}
