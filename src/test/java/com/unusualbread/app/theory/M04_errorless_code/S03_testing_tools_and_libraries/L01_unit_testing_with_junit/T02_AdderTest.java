package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L01_unit_testing_with_junit;

/*
Suppose you have the Adder class.
Implement the corresponding test method using the Assertions.assertEquals(int
expected, int actual) static method and a suitable test case at your discretion
to verify that the add method of the Adder class works correctly. Please
do not add any annotations or import any packages.
*/

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class T02_AdderTest {

    @Test
    void add() {
        T02_Adder adder = new T02_Adder();
        int result = adder.add(1, 2);

        Assertions.assertEquals(3, result);
    }
}