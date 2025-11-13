package com.unusualbread.app.theory.M01_basics.S06_strings.L02_processing_strings;

/*
In Java programming, you are given a string which includes only lowercase
English letters and digits. Your task is to modify the string with the
following rules: If it's a letter, change it to the next letter in the
alphabet. If it's a digit, change it to the previous digit. If the character is
'0', change it to '9'. If the character is 'z', change it to 'a'. You should
return the modified string.
*/

import java.util.Scanner;

public class T04_StringModifier {
    public static String transformString(String s) {
        char[] letters = s.toCharArray();

        for (int i = 0; i < letters.length; i++) {
            char ch = letters[i];
            if (ch >= 'a' && ch <= 'z') {
                letters[i] = (char) ('a' + (ch - 'a' + 1) % 26);
            } else if (ch >= '0' && ch <= '9') {
                letters[i] = (char) ('0' + (ch - '0' - 1 + 10) % 10);
            }
        }
        return String.valueOf(letters);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        System.out.println(transformString(s));
    }
}
