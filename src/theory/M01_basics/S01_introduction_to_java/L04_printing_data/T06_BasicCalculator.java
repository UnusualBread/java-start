package theory.M01_basics.S01_introduction_to_java.L04_printing_data;

import java.util.Scanner;

/*
Write a Java program that reads two integers from the user and prints their
sum, difference, product, and quotient. The program should print each result
on a separate line.
*/

public class T06_BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read two integers from the user
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        // TODO: Calculate the sum of num1 and num2
        System.out.println(num1 + num2);
        // TODO: Calculate the difference of num1 and num2
        System.out.println(num1 - num2);
        // TODO: Calculate the product of num1 and num2
        System.out.println(num1 * num2);
        // TODO: Calculate the quotient of num1 divided by num2
        System.out.println(num1 / num2);

        scanner.close();
    }
}
