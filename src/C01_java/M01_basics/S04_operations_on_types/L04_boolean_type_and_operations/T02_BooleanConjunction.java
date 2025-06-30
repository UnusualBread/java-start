package C01_java.M01_basics.S04_operations_on_types.L03_floating_point_types;

/*
Write a Java program that reads two booleans. Print 'true' if their
logical conjunction (AND operation) is true, else print 'false'.
*/

import java.util.Scanner;

public class T02_BooleanConjunction {
    public static void main(String[] args) {
        // Initialize Scanner object to read the input
        Scanner in = new Scanner(System.in);

        // Read two boolean inputs
        boolean bool1 = in.nextBoolean();
        boolean bool2 = in.nextBoolean();

        // Logic to find the AND operation of 2 booleans goes here
        System.out.println(bool1 && bool2);

        // Close the scanner
        in.close();
    }
}
