package theory.M01_basics.S06_strings.L02_processing_strings;

/*
Write a program that reads a string s and an int n, and then moves the first n
characters of s to the end of the string. The program must output the changed
string. If n is greater than the length of the string, it must output the
string unchanged.
*/

import java.util.Scanner;

public class T15_CharsInStringMover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int amount = sc.nextInt();
        sc.close();

        if (amount > str.length()) {
            System.out.println(str);
            return;
        }

        String beginSubstr = str.substring(0, amount);
        String endSubstr = str.substring(amount);

        System.out.println(endSubstr + beginSubstr);
    }
}
