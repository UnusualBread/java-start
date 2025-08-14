package theory.M01_basics.S06_strings.L03_stringbuilder;

/*
Create a program that checks if a given string is a palindrome, ignoring spaces
and case. A palindrome reads the same forwards and backwards. Read a string
input and print 'Yes' if it's a palindrome, and 'No' otherwise.
*/

import java.util.Scanner;

public class T03_IsPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        // Implement palindrome check here
        boolean isPalindrome = false;

        StringBuilder sb = new StringBuilder(input.replace(" ", "").toLowerCase());

        if (sb.toString().contentEquals(sb.reverse())) {
            isPalindrome = true;
        }

        // Print result
        System.out.println(isPalindrome ? "Yes" : "No");
    }
}
