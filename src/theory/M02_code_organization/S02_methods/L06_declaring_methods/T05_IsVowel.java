package theory.M02_code_organization.S02_methods.L06_declaring_methods;

/*
Implement a method that checks whether a given English letter is a vowel or not.
The input may be in any case.
*/

import java.util.Scanner;

public class T05_IsVowel {

    public static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U';
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}
