package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L01_lambda_expressions;

/*
Write a lambda expression that takes a single String argument, removes all
whitespaces on its both ends and adds PREFIX (before) and SUFFIX (after) to it.
*/

import java.util.function.UnaryOperator;

class PrefixSuffixOperator {

    public static final String PREFIX = "__pref__";
    public static final String SUFFIX = "__suff__";

    public static UnaryOperator<String> operator = s -> PREFIX + s.trim() + SUFFIX;
}
