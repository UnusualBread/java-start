package com.unusualbread.app.theory.M04_errorless_code.S01_exception_handling.L04_null_pointer_exception;

/*
Write a program that reads an integer and a string from the input. If the
integer is greater than 0, print the string that many times. If the integer
is 0 or negative, print "Invalid input!" without throwing any exceptions.
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class T04_StringMultipleTimesPrinter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Read an integer from the input
        String integerStr = reader.readLine();
        int integer = Integer.parseInt(integerStr);

        // Read a string from the input
        String string = reader.readLine();

        // Check if the integer is greater than 0
        // If so, print the string that many times
        // Otherwise, print "Invalid input!"
        if (integer <= 0 || string == null) {
            System.out.println("Invalid input!");
        } else {
            for (int i = 0; i < integer; i++) {
                System.out.println(string);
            }
        }
    }
}
