package C01_java.M01_basics.S03_simple_programs.L01_reading_via_scanner;

/*
Write a program that reads four words from the input and outputs
them in the same order, but each in a new line.
Your program should read the four strings using the next() method
and print out each input in a new line.
*/

import java.util.Scanner;

public class T05_LinesPrinter_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.next();
        String secondWord = sc.next();
        String thirdWord = sc.next();
        String fourthWord = sc.next();

        System.out.println(firstWord);
        System.out.println(secondWord);
        System.out.println(thirdWord);
        System.out.println(fourthWord);

        sc.close();
    }
}