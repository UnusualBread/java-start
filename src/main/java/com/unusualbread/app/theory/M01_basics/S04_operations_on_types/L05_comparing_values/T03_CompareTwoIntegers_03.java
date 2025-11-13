package com.unusualbread.app.theory.M01_basics.S04_operations_on_types.L05_comparing_values;

import java.util.Scanner;

/*
Write a program that reads two integers and determines if the first is greater
than, less than, or equal to the second. Print '>' if the first integer is
greater than the second, '<' if it is less than the second, and '=' if they
are equal.
*/

public class T03_CompareTwoIntegers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();

        if (firstInteger > secondInteger) {
            System.out.println(">");
        } else if (firstInteger < secondInteger) {
            System.out.println("<");
        } else {
            System.out.println("=");
        }

        scanner.close();
    }
}
