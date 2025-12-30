package com.unusualbread.app.theory.M03_working_with_data.S03_collections.MM02_collections_framework.L01_the_collections_framework_overview;

/*
Implement a method called pow2 that takes a collection of numbers and returns a
collection of squares of these numbers.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import java.util.stream.Collectors;

class CollectionUtils2 {

    public static Collection<Integer> pow2(Collection<Integer> numbers) {
        Collection<Integer> squared = new ArrayList<>();
        numbers.forEach(number -> squared.add((int) Math.pow(number, 2)));
        return squared;
    }
}

public class T02_Squarer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Collection<Integer> numbers = Arrays
                .stream(scanner.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Collection<Integer> result = CollectionUtils2.pow2(numbers);

        System.out.println(result.stream()
                .map(Object::toString)
                .collect(Collectors.joining(" ")));
    }
}
