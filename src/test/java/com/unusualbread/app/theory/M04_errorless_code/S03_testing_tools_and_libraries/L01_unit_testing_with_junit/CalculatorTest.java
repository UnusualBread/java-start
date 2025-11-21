package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L01_unit_testing_with_junit;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @org.junit.jupiter.api.Test
    void add() {
        Calculator calculator = new Calculator();
        int result = calculator.add(1, 2);

        assertEquals(3, result);
    }

    @org.junit.jupiter.api.Test
    void subtract() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(1, 2);

        assertEquals(-1, result);
    }

    @org.junit.jupiter.api.Test
    void multiply() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(1, 2);

        assertEquals(2, result);
    }

    @org.junit.jupiter.api.Test
    void divide() {
        Calculator calculator = new Calculator();
        int result = calculator.divide(1, 2);

        assertEquals(0, result);
    }
}