package com.unusualbread.app.theory.M01_basics.S05_control_flow_statements.L04_for_loop;

/*
You are given an integer n which is the number of rows of an inverted pyramid
made up of asterisks (*). Write a Java program to create an inverted pyramid
of asterisks. For a given n, print n lines where the i-th line has (n - i + 1)
asterisks, for i from 1 to n. Each line of the pyramid should end with a
newline character ('\n').
*/

import java.util.Scanner;

public class T09_AsterisksPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfAsterisks = sc.nextInt();

        for (int i = 0; i < numberOfAsterisks; i++) {
            for (int j = 0; j < numberOfAsterisks - i; j++) {
                System.out.print("*");
            }

            System.out.print("\n");
        }

        sc.close();
    }
}
