package theory.M01_basics.S04_operations_on_types.L02_characters;

/*
Write a program that checks if a given string
starts with the prefix "J" ignoring the case.
*/

import java.util.Scanner;

public class T03_PrefixChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toUpperCase();

        System.out.println(str.charAt(0) == 'J');

        sc.close();
    }
}
