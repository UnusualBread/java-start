package theory.M01_basics.S06_strings.L02_processing_strings;

/*
Write a program that takes a sentence as input and returns the index of the
first occurrence of the word "the" (can be part of a word), regardless of the
capitalization. If there is no occurrence of "the", the program should output
-1.
*/

import java.util.Scanner;

public class T11_OccurrenceFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();

        System.out.println(str.indexOf("the"));
    }
}
