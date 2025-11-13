package com.unusualbread.app.theory.M01_basics.S04_operations_on_types.L03_floating_point_types;

/*
Write a program which reads a double value x
and evaluates the result of x^3+x^2+x+1
*/

import java.util.Scanner;

public class T04_ExponentialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();

        double result = Math.pow(x, 3) + Math.pow(x, 2) + x + 1;

        System.out.println(result);

        sc.close();
    }
}
