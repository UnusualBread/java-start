package com.unusualbread.app.theory.M02_code_organization.S02_methods.L04_functional_decomposition;

/*
Here is a math function that Kate wants to use in her program:

f(x)={
      x^2 + 1    if x ≤ 0
      1 / x^2    if 0 < x < 1
      x^2 − 1    if x ≥ 1
      }

The template for this function is defined below. Let's decompose it!

Your task is to create three additional methods f1, f2, and f3 for each case and complete the method f. Each method should accept x as an argument with double type.
*/

import java.util.Scanner;

public class T03_FunctionEvaluator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        System.out.println(f(x));

        scanner.close();
    }

    public static double f(double x) {
        //call your implemented methods here.
        if (x <= 0) {
            return f1(x);
        }

        if (x < 1) {
            return f2(x);
        }

        return f3(x);
    }

    //implement your methods here
    public static double f1 (double x) {
        return x * x + 1;
    }

    public static double f2 (double x) {
        return 1 / (x * x);
    }

    public static double f3 (double x) {
        return x * x - 1;
    }
}
