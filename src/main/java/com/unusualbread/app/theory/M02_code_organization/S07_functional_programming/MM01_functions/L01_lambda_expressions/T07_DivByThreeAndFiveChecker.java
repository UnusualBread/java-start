package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L01_lambda_expressions;

/*
Write a lambda expression that takes an integer n as input and returns true if
n is divisible by both 3 and 5, and false otherwise.
*/

import java.util.Scanner;
import java.util.function.Function;

public class T07_DivByThreeAndFiveChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        Function<Integer, Boolean> function = (x) -> x % 3 == 0 && x % 5 == 0;

        System.out.println(function.apply(n));
    }
}
