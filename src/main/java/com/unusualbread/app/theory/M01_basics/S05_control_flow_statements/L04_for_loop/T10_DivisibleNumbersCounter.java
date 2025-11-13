package com.unusualbread.app.theory.M01_basics.S05_control_flow_statements.L04_for_loop;

/*
Write a program that reads three positive integers a, b, n and outputs the
count of numbers divisible by n in the range from a to b (a < b) inclusively.
*/

import java.util.Scanner;

public class T10_DivisibleNumbersCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leftInterval = sc.nextInt();
        int rightInterval = sc.nextInt();
        int divider = sc.nextInt();

        int count = 0;
        for (int i = leftInterval; i <= rightInterval; i++) {
            if (i % divider == 0) {
                count++;
            }
        }

        System.out.println(count);

        sc.close();
    }
}