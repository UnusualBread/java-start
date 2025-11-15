package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L01_lambda_expressions;

/*
Write a lambda expression that accepts two integer arguments and returns the
maximum of them.

Try not to use the Math library.
*/

import java.util.function.IntBinaryOperator;

class Operator2 {

    public static IntBinaryOperator binaryOperator = (a, b) -> a > b ? a : b;
}
