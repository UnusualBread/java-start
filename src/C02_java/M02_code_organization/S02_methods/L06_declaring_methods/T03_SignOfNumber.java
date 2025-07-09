package C02_java.M02_code_organization.S02_methods.L06_declaring_methods;

/*
Write a method with the name sign that takes an int number
and checks whether the number is negative, positive or zero.
The method should return -1, +1 or 0 respectively.
*/

import java.util.Scanner;

public class T03_SignOfNumber {

    public static int sign(int number) {
        // write your code here
        return number > 0 ? 1 : number < 0 ? -1 : 0;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}
