package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L05_comparable;

/*
A personal data processing system uses a class called Age instead of a
primitive value to store a person's age. Change this class so that it is
possible to compare Age objects.
*/

import java.util.*;
import java.util.stream.Collectors;

class Age implements Comparable<Age> {
    private final int value;

    public Age(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public int compareTo(Age age) {
        return Integer.compare(value, age.value);
    }
}

class T04_ByAgeSorter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Age> list = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .mapToObj(Age::new)
                .sorted()
                .collect(Collectors.toList());

        Checker2.check(list);
    }
}

class Checker2 {
    static void check(List<Age> list) {
        for (int i = 1; i < list.size(); i++) {
            var curr = list.get(i);
            var prev = list.get(i - 1);
            if (curr.getValue() < prev.getValue()) {
                System.out.println("Incorrect sorted order");
                return;
            }
        }
        System.out.println("Correct sorted order");
    }
}
