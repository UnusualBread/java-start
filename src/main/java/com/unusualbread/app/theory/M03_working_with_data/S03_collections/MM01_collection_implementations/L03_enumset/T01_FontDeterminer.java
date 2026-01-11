package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM01_collection_implementations.L03_enumset;

/*
Your team is creating a Java module that returns an ArrayList with an enum set
(or sets) to apply the styles on the respective document type. The next part of
the module has to be completed by you.
*/

import java.util.EnumSet;
import java.util.Scanner;

public class T01_FontDeterminer {

    enum Fonts {
        BOLD, LARGE, MEDIUM, SMALL, ITALIC, NORMAL
    }

    EnumSet<Fonts> enumSet;

    public static void main(String[] args) {

        T01_FontDeterminer object = new T01_FontDeterminer();

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine().trim();

        object.enumSet = switch (string) {
            case "Main-Heading" -> EnumSet.of(Fonts.BOLD, Fonts.LARGE, Fonts.NORMAL);
            case "Quote" -> EnumSet.of(Fonts.SMALL, Fonts.ITALIC);
            case "Paragraph" -> EnumSet.of(Fonts.SMALL, Fonts.NORMAL);
            case "Sub-Heading" -> EnumSet.of(Fonts.MEDIUM, Fonts.NORMAL);
            case "Quote|BOLD" -> EnumSet.of(Fonts.BOLD, Fonts.SMALL, Fonts.ITALIC);
            default -> null;
        };
        System.out.println(object.enumSet == null ? "ERROR" : object.enumSet);
    }
}
