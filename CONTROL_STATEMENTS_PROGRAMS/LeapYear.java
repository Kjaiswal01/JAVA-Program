// Package declaration (optional, organize your programs)
package CONTROL_STATEMENTS_PROGRAMS;

// Class to check if a given year is a Leap Year
class LeapYear {
    public static void main(String[] args) {
        int year = 2016; // Declare the year to check

        // Leap Year Conditions:
        // 1. Year divisible by 400 → Leap Year
        // 2. Year divisible by 4 AND not divisible by 100 → Leap Year
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " ---> Leap Year"); // If leap year, print this
        } else {
            System.out.println(year + " not a Leap Year"); // If not leap year, print this
        }
    }
}
