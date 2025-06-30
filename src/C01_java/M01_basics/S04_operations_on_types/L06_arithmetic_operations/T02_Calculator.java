package C01_java.M01_basics.S04_operations_on_types.L06_arithmetic_operations;

/*
Given two integers, your task is to calculate their sum, multiplication result,
and the result of the first integer divided by the second integer
(without decimal places). You can assume that the second integer is never zero.
First, scan two integers from the standard input. Then, print the three results
in separate lines: the sum, multiplication result, and division result.
*/

import java.util.Scanner;

public class T02_Calculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scan = new Scanner(System.in);

        // Read the first integer
        int num1 = scan.nextInt();

        // Read the second integer
        int num2 = scan.nextInt();

        // TODO: Perform addition, multiplication, and division operations
        System.out.println(num1 + num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);

        scan.close();
    }
}
