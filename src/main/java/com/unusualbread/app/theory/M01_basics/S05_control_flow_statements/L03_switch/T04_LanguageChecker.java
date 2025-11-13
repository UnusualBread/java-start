package com.unusualbread.app.theory.M01_basics.S05_control_flow_statements.L03_switch;

/*
We need your help to improve an adaptive system.
There's a program that asks learners what programming language
they are learning. There are four options, one of them is correct:
    1. Java
    2. Kotlin
    3. Scala
    4. Python
Your task: read the answer’s number from the standard input and output
the result of the test: "Yes!", "No!" or "Unknown number".
*/

import java.util.Scanner;

public class T04_LanguageChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfLanguage = sc.nextInt();

        switch (numberOfLanguage) {
            case 1:
                System.out.println("Yes!");
                break;
            case 2, 3, 4:
                System.out.println("No!");
                break;
            default:
                System.out.println("Unknown number");
        }

        sc.close();
    }
}
