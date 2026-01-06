package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L03_the_set_interface;

/*
Write a Java program that reads a single string as input, representing a list
of names separated by commas (with no spaces). Your program should discard all
duplicate names and print all unique names in the same order they appear in the
input.
*/

import java.util.*;

public class T03_UniqueStringsPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] names = input.split(",");
        Set<String> uniqueNames = new LinkedHashSet<>(List.of(names));
        System.out.print(String.join(",", uniqueNames));
    }
}
