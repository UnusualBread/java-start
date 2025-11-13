package com.unusualbread.app.theory.M04_errorless_code.S02_debugging.L01_debugging_techniques;

/*
Your task is to add some logging to this method so it prints the input string
and the string to be returned by the method in the following format:
Before: string
After: String
*/

class Util2 {
    public static String capitalize(String str) {
        System.out.println("Before: " + str);
        if (str == null || str.isBlank()) {
            System.out.println("After: " + str);
            return str;
        }

        if (str.length() == 1) {
            str = str.toUpperCase();
            System.out.println("After: " + str);
            return str;
        }

        str = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        System.out.println("After: " + str);
        return str;
    }
}
