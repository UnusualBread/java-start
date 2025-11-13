package com.unusualbread.app.theory.M01_basics.S05_control_flow_statements.L02_conditional_statement;

/*
You are given a number N. If N is positive print 'Positive', if N is negative
print 'Negative', and if N is zero, print 'Zero'.
*/

import java.util.Scanner;

public class T06_SignChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}
