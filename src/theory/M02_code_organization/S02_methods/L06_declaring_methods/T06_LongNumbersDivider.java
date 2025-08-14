package theory.M02_code_organization.S02_methods.L06_declaring_methods;

/*
To perform math division, you have the method named divide that takes two long
numbers and returns a double value.

Write a body of the method. It should return the result of the division of the
first argument by the second one. It's guaranteed that the second argument is
not equal to zero.
*/

import java.util.Scanner;

public class T06_LongNumbersDivider {

    public static double divide(long a, long b) {
        // write your code here
        return (double) a / b;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final long a = scanner.nextLong();
        final long b = scanner.nextLong();
        System.out.println(divide(a, b));
    }
}
