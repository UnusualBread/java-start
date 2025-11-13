package com.unusualbread.app.theory.M01_basics.S06_strings.L03_stringbuilder;

/*
Implement a method that takes a String message as an argument. The method
translates all letters having an even index to uppercase (index 0 is considered
even) and returns the result.
*/

import java.util.Scanner;

class EvenUpperCase {

    public static String upperEvenLetters(String message) {
        // write your code here
        StringBuilder sb = new StringBuilder(message);

        for (int i = 0; i < sb.length(); i += 2) {
            char upperChar = Character.toUpperCase(sb.charAt(i));
            sb.setCharAt(i, upperChar);
        }

        return sb.toString();
    }

    // Don't change the code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message = scanner.next();

        System.out.println(upperEvenLetters(message));
    }
}
