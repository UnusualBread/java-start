package C01_java.M01_basics.S06_strings.L02_processing_strings;

/*
Write a program that reads a string and checks whether it is a palindrome, i.e.
it reads the same both left-to-right and right-to-left.
The program must output “yes” if the string is a palindrome and “no” otherwise.
*/

import java.util.Scanner;

public class T09_IsPalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        boolean isPalindrome = true;

        for (int i = 0; i < str.length() / 2; i++) {
            char char1 = str.charAt(i);
            char char2 = str.charAt(str.length() - 1 - i);

            if (char1 != char2) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "yes" : "no");
    }
}
