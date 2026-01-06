package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L03_the_set_interface;

/*
Create a TreeSet named set and fill it with the following three strings
"Gamma", "Alpha", "Omega".
*/

import java.util.Set;
import java.util.TreeSet;

public class T04_TreeSetStringsPrinter {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>(Set.of("Gamma", "Alpha", "Omega"));
        System.out.println(set);
    }
}
