package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L03_parameterized_test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @ParameterizedTest
    @ValueSource(strings = {"aaaa", "AaAaaaA", "Radar", "My gym", "Don't nod", "No lemon, no melon"})
    void testIsPalindrome(String string) {
        assertTrue(StringUtils.isPalindrome(string));
    }

    @ParameterizedTest
    @ValueSource(strings = {"", "hello!", "horror", "Ill will", "((()))", "[))))]", "222222122222"})
    void testIsNotPalindrome(String string) {
        assertFalse(StringUtils.isPalindrome(string));
    }
}