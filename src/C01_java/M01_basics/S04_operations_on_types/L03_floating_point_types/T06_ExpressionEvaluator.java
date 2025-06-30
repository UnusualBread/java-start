package C01_java.M01_basics.S04_operations_on_types.L03_floating_point_types;

/*
Write a program that reads three double values a, b, c,
and then solves the simple equation:
a * x + b = c
The program should output the value of x.
*/

import java.util.Scanner;

public class T06_ExpressionEvaluator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double x = (c - b) / a;

        System.out.println(x);

        sc.close();
    }
}
