package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L04_standard_functional_interfaces;

/*
Implement a ternaryOperator method that accepts a predicate condition, and two
functions ifTrue and ifFalse and returns a function. The returning function
takes an argument, and checks if the condition predicate is true for this
argument, and if it is — applies the ifTrue function to the argument,
otherwise, it applies ifFalse function.
*/

import java.util.Objects;
import java.util.Scanner;
import java.util.function.*;

class Operator {

    public static <T, U> Function<T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse) {

        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);

    }
}

public class T03_SafeStringLengthGetter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String str = "null".equals(input) ? null : input;

        Predicate<Object> condition = Objects::isNull;
        Function<Object, Integer> ifTrue = obj -> 0;
        Function<CharSequence, Integer> ifFalse = CharSequence::length;
        Function<String, Integer> safeStringLength = Operator.ternaryOperator(condition, ifTrue, ifFalse);

        System.out.println(safeStringLength.apply(str));
    }
}