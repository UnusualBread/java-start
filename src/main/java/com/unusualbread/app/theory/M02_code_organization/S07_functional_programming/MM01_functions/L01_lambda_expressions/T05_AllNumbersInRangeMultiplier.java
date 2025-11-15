package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L01_lambda_expressions;

/*
Write a lambda expression that accepts two long arguments as a range's borders
and calculates (returns) the product of all numbers in this range (inclusively)
*/

import java.util.function.*;

class Operator4 {

    public static LongBinaryOperator binaryOperator = ((left, right) -> {
        long product = 1;
        for (long i = left; i <= right; i++) product *= i;
        return product;
    });
}
