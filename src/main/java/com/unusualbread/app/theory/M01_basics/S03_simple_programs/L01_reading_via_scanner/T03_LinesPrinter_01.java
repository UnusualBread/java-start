package com.unusualbread.app.theory.M01_basics.S03_simple_programs.L01_reading_via_scanner;

/*
Write a program that reads five words from the standard input as shown
in the example. After taking the input, you should output each word in
a new line. The words should be in the same order.
*/

import java.util.Scanner;

public class T03_LinesPrinter_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.next();
        String fourthWord = sc.next();
        String fifthWord = sc.next();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        System.out.println(fourthWord);
        System.out.println(fifthWord);

        sc.close();
    }
}
