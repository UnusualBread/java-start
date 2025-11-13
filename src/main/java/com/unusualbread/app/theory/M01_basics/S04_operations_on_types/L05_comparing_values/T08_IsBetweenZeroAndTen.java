package com.unusualbread.app.theory.M01_basics.S04_operations_on_types.L05_comparing_values;

/*
Write a program that reads an integer value and checks
if it is less than 10 and greater than 0.
*/

import java.util.Scanner;

public class T08_IsBetweenZeroAndTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(number > 0 && number < 10);

        sc.close();
    }
}
