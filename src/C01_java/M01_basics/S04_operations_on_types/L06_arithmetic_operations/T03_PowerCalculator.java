package C01_java.M01_basics.S04_operations_on_types.L06_arithmetic_operations;

/*
You have to find out the square, cube and fourth power of a given
positive integer. The input will be a single line containing a single
positive integer (n). The output should be three lines, first line
prints the square of n, next line prints the cube of n and third line
prints the fourth power of n.
*/

import java.util.Scanner;

public class T03_PowerCalculator {
    public static void main(String args[]) {
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);

        // Read the next integer
        int n = in.nextInt();

        // Compute and print the square of n
        System.out.println(n * n);
        // Compute and print the cube of n
        System.out.println(n * n * n);
        // Compute and print the fourth power of n
        System.out.println(n * n * n * n);

        in.close();
    }
}
