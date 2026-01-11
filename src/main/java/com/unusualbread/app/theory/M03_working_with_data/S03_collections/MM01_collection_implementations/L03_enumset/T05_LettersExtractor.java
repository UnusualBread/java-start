package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L03_enumset;

/*
Change the code, paying special attention to switch statement cases, by
modifying the EnumSet enumSet variable by interpreting the case string.
*/

import java.util.EnumSet;
import java.util.Scanner;
import static com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L03_enumset.T05_LettersExtractor.Alphabets.*;

public class T05_LettersExtractor {

    enum Alphabets {
        A, B, E, I, L, O, T, U
    }

    EnumSet<Alphabets> enumSet;

    public static void main(String[] args) {
        T05_LettersExtractor object = new T05_LettersExtractor();

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim();

        object.enumSet = switch (string) {
            case "setOfVowels" -> EnumSet.of(A, E, I, O, U);
            case "setOfConsonants" -> EnumSet.of(B, L, T);
            case "containsAOnly" -> EnumSet.of(A);
            case "empty" -> EnumSet.noneOf(Alphabets.class);
            case "exceptT-A-E" -> EnumSet.complementOf(EnumSet.of(T, A, E));
            default -> null;
        };
        System.out.println(object.enumSet == null ? "ERROR" : object.enumSet);
    }
}