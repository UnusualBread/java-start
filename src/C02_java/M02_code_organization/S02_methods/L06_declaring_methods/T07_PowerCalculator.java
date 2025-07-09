package C02_java.M02_code_organization.S02_methods.L06_declaring_methods;

/*
You're given the method power that takes two int numbers n and m.
The method should return the value of nm as a long value.
*/

import java.util.Scanner;

public class T07_PowerCalculator {

    public static long power(int n, int m) {
        // write your code here
        long result = 1;

        for (int i = 0; i < m; i++) {
            result *= n;
        }

        return result;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        final int m = scanner.nextInt();
        System.out.println(power(n, m));
    }
}
