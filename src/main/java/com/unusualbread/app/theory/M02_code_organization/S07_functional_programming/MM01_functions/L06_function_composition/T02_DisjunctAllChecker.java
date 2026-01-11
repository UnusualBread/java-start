package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L06_function_composition;

/*
Write the disjunctAll method that accepts a list of IntPredicate objects and
returns a single IntPredicate. The result predicate is a disjunction of all
input predicates.
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.IntPredicate;

class CombiningPredicates {

    public static IntPredicate disjunctAll(List<IntPredicate> predicates) {
        if (predicates.isEmpty()) {
            return x -> false;
        }
        IntPredicate resultPredicate = predicates.getFirst();
        for (int i = 1; i < predicates.size(); i++) {
            resultPredicate = resultPredicate.or(predicates.get(i));
        }
        return resultPredicate;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] strings = scanner.nextLine().split(" ");

        List<Boolean> values = Arrays.stream(strings)
                .map(Boolean::parseBoolean)
                .toList();

        List<IntPredicate> predicates = new ArrayList<>();
        values.forEach(v -> predicates.add(x -> v));

        System.out.println(disjunctAll(predicates).test(0));
    }
}