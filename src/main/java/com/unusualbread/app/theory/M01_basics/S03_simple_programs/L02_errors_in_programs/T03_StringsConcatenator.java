package com.unusualbread.app.theory.M01_basics.S03_simple_programs.L02_errors_in_programs;

/*
You are given a program that should read three strings,
concatenate them and output the result.
For some reason, the program doesn't compile.
Fix all compile-time errors as well as logic-errors.
*/

import java.util.Scanner;

public class T03_StringsConcatenator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String a = scanner.next();
        String b = scanner.next();
        String c = scanner.next();

        String result = a + b + c;

        System.out.println(result);
    }
}
