package com.unusualbread.app.theory.M05_additional_instruments.S01_essential_standard_classes.MM01_standard_classes_for_computations.L02_math_library;

import java.util.Scanner;

public class T04_QuadraticEquationCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double d = Math.pow(b, 2) - 4 * a * c;

        double x1 = (-b + Math.sqrt(d)) / (2 * a);
        double x2 = (-b - Math.sqrt(d)) / (2 * a);

        System.out.println(Math.min(x1, x2) + " " + Math.max(x1, x2));

        sc.close();
    }
}
