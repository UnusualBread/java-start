package com.unusualbread.app.theory.M01_basics.S05_control_flow_statements.L01_break_and_continue;

/*
Create a Java program that finds and prints the first perfect square number
greater than a given input number. A perfect square is an integer that is
the square of another integer. Take an integer N as input (1 <= N <= 10000)
and use a loop to check numbers starting from N+1. Use the break statement
to exit the loop when the first perfect square is found. Print the perfect
square number.
*/

import java.util.Scanner;

public class T02_PerfectSquareFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginNumber = scanner.nextInt();

        int numberBeingChecked = beginNumber;

        perfectNumberFound:
        while (true) {
            numberBeingChecked++;

            for (int i = 2; i < numberBeingChecked / 2 + 1; i++) {
                if (i * i == numberBeingChecked) {
                    break perfectNumberFound;
                }
            }
        }

        System.out.println(numberBeingChecked);

        scanner.close();
    }
}
