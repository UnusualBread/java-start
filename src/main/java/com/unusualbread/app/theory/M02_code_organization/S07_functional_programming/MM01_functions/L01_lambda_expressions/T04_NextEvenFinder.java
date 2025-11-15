package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L01_lambda_expressions;

/*
Write a lambda expression that accepts a long value and returns the next even
number.
*/

import java.util.function.LongUnaryOperator;

class Operator3 {

    public static LongUnaryOperator unaryOperator = x -> {
        while (true) if (++x % 2 == 0) return x;
    };
}