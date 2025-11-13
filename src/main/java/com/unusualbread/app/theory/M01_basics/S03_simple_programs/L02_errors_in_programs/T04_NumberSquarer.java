package com.unusualbread.app.theory.M01_basics.S03_simple_programs.L02_errors_in_programs;

/*
Write a program that scans an integer from the user. If the scanned integer is
negative, print "Invalid input!", otherwise print the square of the integer.
*/

import java.util.Scanner;

public class T04_NumberSquarer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read an integer from the user
        int number = scanner.nextInt();

        // Check if the number is negative
        if (number < 0) {
            System.out.println("Invalid input!");
        } else {
            System.out.println(number * number);
        }

        // Print the square of the number if it's non-negative

    }
}
