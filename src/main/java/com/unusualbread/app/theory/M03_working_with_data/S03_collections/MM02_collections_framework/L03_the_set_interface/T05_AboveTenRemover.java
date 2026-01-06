package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L03_the_set_interface;

/*
Implement two methods.
The first method should create a set from a string of numbers separated by a
space.
The second method should remove all numbers greater than 10 from the given set.
*/

import java.util.*;

class SetUtils2 {

    public static Set<Integer> getSetFromString(String str) {
        Set<Integer> set = new HashSet<>();
        List.of(str.split(" ")).forEach(s -> set.add(Integer.parseInt(s)));
        return set;
    }

    public static void removeAllNumbersGreaterThan10(Set<Integer> set) {
        SortedSet<Integer> sortedSet = new TreeSet<>(set);
        set.retainAll(sortedSet.headSet(11));
    }

}

public class T05_AboveTenRemover {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        Set<Integer> set = SetUtils2.getSetFromString(numbers);
        SetUtils2.removeAllNumbersGreaterThan10(set);
        set.forEach(e -> System.out.print(e + " "));
    }
}