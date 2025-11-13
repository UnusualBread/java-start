package com.unusualbread.app.theory.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

/*
Write a program that reads a three-digit number, calculates the
new number by reversing its digits, and outputs a new number.
*/

import java.util.Scanner;

public class T10_Reverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        int reversedNumber = number % 10 * 100 + number / 10 % 10 * 10 + number / 100;

        System.out.println(reversedNumber);

        sc.close();
    }
}
