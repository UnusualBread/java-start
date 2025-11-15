package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L01_lambda_expressions;

/*
Using closure write a lambda expression that calculates a * x^2 + b * x + c
where a, b, c are context final variables. They will be available in the
context during testing. Note, the result is double.
*/

import java.util.function.DoubleUnaryOperator;

class Operator {

    public static int a = 10;
    public static int b = 20;
    public static int c = 30;

    public static DoubleUnaryOperator unaryOperator = x -> a * x * x + b * x + c;
}