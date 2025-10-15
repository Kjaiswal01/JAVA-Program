package CONTROL_STATEMENTS_PROGRAMS;

import java.util.*;

// ✅ Program: Simple Calculator using Switch Case and Loop
class CreateCalculator {
    public static void main(String[] args) {

        String yn; // Variable to store user's choice (y/n)

        // 🔁 Using do-while loop to repeat calculator until user wants to exit
        do {
            Scanner s = new Scanner(System.in);

            // 🧮 Taking input for two numbers
            System.out.println("Enter First No: ");
            int no1 = s.nextInt();

            System.out.println("Enter Second No: ");
            int no2 = s.nextInt();

            // 🧩 Asking user to choose an operation
            System.out.println("Select Symbol (+, -, *, /): ");
            String sym = s.next();

            int res; // Variable to store result

            // ⚙️ Performing operation using switch-case
            switch (sym) {
                case "+": // Addition
                    res = no1 + no2;
                    System.out.println("Addition is: " + res);
                    break;

                case "-": // Subtraction
                    res = no1 - no2;
                    System.out.println("Subtraction is: " + res);
                    break;

                case "*": // Multiplication
                    res = no1 * no2;
                    System.out.println("Multiplication is: " + res);
                    break;

                case "/": // Division (integer division)
                    // ✅ Optional check to avoid division by zero
                    if (no2 != 0) {
                        res = no1 / no2;
                        System.out.println("Division is: " + res);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;

                default: // Invalid operator case
                    System.out.println("Invalid Symbol...");
                    break;
            }

            // 🔁 Asking user if they want to continue
            System.out.println("Do you want to continue? (Press y for Yes and n for No): ");
            yn = s.next();

        } while (yn.equals("y") || yn.equals("Y")); // Loop continues if user presses 'y' or 'Y'
    }
}
