package com.unusualbread.app.theory.M01_basics.S06_strings.L02_processing_strings;

/*
Write a program that reads a string, and then outputs the string without its
middle character when the length is odd, and without the middle 2 characters
when the length is even.
*/

import java.util.Scanner;

public class T16_MiddleOfStringCutter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        String result;
        int length = str.length();

        if (length % 2 == 0) {
            result = str.substring(0, length / 2 - 1) + str.substring(length / 2 + 1);
        } else {
            result = str.substring(0, length / 2) + str.substring(length / 2 + 1);
        }

        System.out.println(result);
    }
}
