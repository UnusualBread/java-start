package com.unusualbread.app.theory.M04_errorless_code.S01_exception_handling.L04_null_pointer_exception;

/*
Here's a program that may throw NullPointerException.
Fix it to avoid the exception.

In the case when the exception may occur,
the program should print the string "NPE!".
*/

import java.util.Scanner;

public class T02_StringToLowerCasePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */

        System.out.println(string == null ? "NPE!" : string.toLowerCase());
    }
}
