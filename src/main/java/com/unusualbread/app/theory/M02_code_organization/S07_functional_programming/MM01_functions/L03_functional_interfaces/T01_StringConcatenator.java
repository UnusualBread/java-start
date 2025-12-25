package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L03_functional_interfaces;

/*
Write a lambda expression that accepts seven (!) string arguments and returns a
string in uppercase concatenated from all of them.
*/

class Seven {
    public static SeptenaryStringFunction fun = (s1, s2, s3, s4, s5, s6, s7) -> (s1 + s2 + s3 + s4 + s5 + s6 + s7).toUpperCase();
}

@FunctionalInterface
interface SeptenaryStringFunction {
    String apply(String s1, String s2, String s3, String s4, String s5, String s6, String s7);
}
