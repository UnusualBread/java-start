package com.unusualbread.app.theory.M01_basics.S06_strings.L03_stringbuilder;

/*
Write a program that reads a string as input and reverses it using
StringBuilder. The input string will contain only lowercase English letters and
will have a maximum length of 100 characters. Print the reversed string as
output.
*/

import java.util.Scanner;

public class T02_StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String inputString = scanner.nextLine();

        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder(inputString);

        // Reverse the string using StringBuilder
        sb.reverse();

        // Print the reversed string
        System.out.println(sb.toString());
    }
}
