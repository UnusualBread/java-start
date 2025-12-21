package com.unusualbread.app.theory.M04_errorless_code.S03_testing_tools_and_libraries.L03_parameterized_test;

/*
Unsatisfied with palindrome checkers from stackoverflow.com, you decided to
write your own implementation of this algorithm and apply the test driven
development approach to this process. First, you defined a set of rules for
your checker. After that, you wrote tests to enforce these rules. It's about
time to implement the checker itself.
*/

import java.util.Locale;

class StringUtils {
    public static boolean isPalindrome(String str) {
        if (str == null || str.isBlank() || str.length() < 2) {
            return false;
        }

        str = str.replaceAll("[\\s']", "").toLowerCase(Locale.ROOT);

        int firstChar = 0;
        int lastChar = str.length() - 1;

        while (firstChar < lastChar) {
            if (str.charAt(firstChar) != str.charAt(lastChar)) return false;
            firstChar++;
            lastChar--;
        }

        return true;
    }
}
