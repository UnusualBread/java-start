package theory.M02_code_organization.S02_methods.L06_declaring_methods;

/*
Write a method that calculates the factorial of a given number.
*/

import java.util.Scanner;

public class T04_FactorialCalculator {

    public static long factorial(long n) {
        // write your code here
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}
