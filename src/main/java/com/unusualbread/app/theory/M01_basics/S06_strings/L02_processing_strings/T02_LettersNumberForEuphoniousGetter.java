package com.unusualbread.app.theory.M01_basics.S06_strings.L02_processing_strings;

/*
A word is considered euphonious (pleasant-sounding) if it doesn't have three or
more vowels or consonants in a row. Otherwise, it is considered discordant
(harsh-sounding).
Your task is to create euphonious words from discordant. You can insert any
letters inside the word. You should output the minimum number of characters
needed to create a euphonious word from a given word.
*/

import java.util.Scanner;

public class T02_LettersNumberForEuphoniousGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        sc.close();
        String vowels = "aeiouy";
        int rowCount = 1;
        int lettersNeeded = 0;

        for (int i = 0; i < word.length() - 1; i++) {
            char ch = word.charAt(i);
            char nextCh = word.charAt(i + 1);
            boolean isCurrVowel = vowels.contains(String.valueOf(ch));
            boolean isNextVowel = vowels.contains(String.valueOf(nextCh));

            if (isCurrVowel && isNextVowel || !isCurrVowel && !isNextVowel) {
                rowCount++;
                if (rowCount == 3) {
                    lettersNeeded++;
                    rowCount = 1;
                }
            } else {
                rowCount = 1;
            }
        }

        System.out.println(lettersNeeded);
    }
}
