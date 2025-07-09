package C02_java.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

import java.util.Scanner;

/*
Given an integer input, write a Java program that computes the following:
divide the number by 2 and display the remainder, then multiply the result
by 3 and display the result. The input will be a single integer 'n'
(0 ≤ n ≤ 100). Print two lines where the first line shows the remainder of
the number divided by 2 and the second line shows the result of the remainder
multiplied by 3.
*/

public class T03_ComputRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // The first operation goes here
        int remainder = input % 2;

        // The second operation goes here
        int result = remainder * 3;

        System.out.print(remainder + "\n" + result);

        scanner.close();
    }
}
