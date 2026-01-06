package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L03_the_set_interface;

/*
In this problem, you need to implement a math operation that checks whether the
second set is a strict superset of the first set.

It means, the second set should contain all elements of the first set, but the
sets must not be equal.
*/

import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class T07_StrictSupersetChecker {

    private static <T> boolean isStrictSuperset(Set<T> set1, Set<T> set2) {
        return set2.size() > set1.size() && set2.containsAll(set1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Set<String> set1 = readStringSet(scanner);
        Set<String> set2 = readStringSet(scanner);

        System.out.println(isStrictSuperset(set1, set2));
    }

    private static Set<String> readStringSet(Scanner scanner) {
        return Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .collect(Collectors.toSet());
    }
}
