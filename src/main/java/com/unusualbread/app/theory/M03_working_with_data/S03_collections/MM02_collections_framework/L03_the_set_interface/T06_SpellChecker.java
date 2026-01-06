package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L03_the_set_interface;

/*
The simplest spell checker is the one based on a list of known words. Every
word in the text is being searched for in this list and, if such word was not
found, it is marked as erroneous.

Write a program that outputs those words from the text that are not found in
the dictionary (i.e. erroneous). Your spell checker should be case-insensitive.
The words are entered in an arbitrary order. Words, which are not found in the
dictionary, should not be duplicated in the output.
*/

import java.util.*;

public class T06_SpellChecker {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Scanner sc = new Scanner(System.in);

        int dictionaryLength = Integer.parseInt(sc.nextLine());
        Set<String> dictionary = new HashSet<>((dictionaryLength * 4 + 2) / 3);

        for (int i = 0; i < dictionaryLength; i++) {
            dictionary.add(sc.nextLine().toLowerCase());
        }

        int numberOfLines = Integer.parseInt(sc.nextLine());
        Set<String> erroneousWords = new LinkedHashSet<>();

        for (int i = 0; i < numberOfLines; i++) {
            List<String> wordsInLine = List.of(sc.nextLine().split(" "));
            wordsInLine.forEach(s -> {
                if (!dictionary.contains(s.toLowerCase())) {
                    erroneousWords.add(s);
                }
            } );
        }

        erroneousWords.forEach(System.out::println);
    }
}
