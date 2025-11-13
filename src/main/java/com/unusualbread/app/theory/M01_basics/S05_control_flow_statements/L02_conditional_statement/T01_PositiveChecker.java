package com.unusualbread.app.theory.M01_basics.S05_control_flow_statements.L02_conditional_statement;

import java.util.Scanner;

/*
Write a program that reads a number and prints YES if it is positive.
Otherwise, the program should print NO.
*/

public class T01_PositiveChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
