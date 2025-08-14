package theory.M01_basics.S06_strings.L02_processing_strings;

/*
Write a program that reads a string and outputs "true" only when the letters of
this string form a substring of the ordered English alphabet, for example,
"abc", "xy", "pqrst".
Otherwise, it should print out "false".
*/

import java.util.Scanner;

public class T10_IsAlphabetSubstringChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String substr = sc.nextLine();
        sc.close();

        String alphabetString = "abcdefghijklmnopqrstuvwxyz";

        System.out.println(alphabetString.contains(substr));
    }
}
