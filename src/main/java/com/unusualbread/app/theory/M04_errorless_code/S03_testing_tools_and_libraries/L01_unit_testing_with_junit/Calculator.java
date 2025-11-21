package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L01_unit_testing_with_junit;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero!");
        }
        return a / b;
    }
}
