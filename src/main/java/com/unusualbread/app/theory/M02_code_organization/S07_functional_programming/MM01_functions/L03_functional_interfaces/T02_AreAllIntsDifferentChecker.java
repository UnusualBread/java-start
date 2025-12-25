package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L03_functional_interfaces;

/*
Write your own functional interface called TernaryIntPredicate and use it with
a lambda expression. The interface must have a single non-static (and
non-default) method called test that accepts three int arguments and returns a
boolean value.

Also, write a lambda expression of the TernaryIntPredicate type with three int
arguments.
The lambda expression should return true if all passed values are different,
otherwise it should return false. The expression should be assigned to a static
field named ALL_DIFFERENT.
*/

class Predicate {
    public static final TernaryIntPredicate ALL_DIFFERENT = (n1, n2, n3) -> (n1 != n2 && n2 != n3 && n1 != n3);

    @FunctionalInterface
    public interface TernaryIntPredicate {
        boolean test(int n1, int n2, int n3);
    }
}
