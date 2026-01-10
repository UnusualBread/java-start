package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L05_optional;

/*
Write a code in the Main class that sums up all values and prints the result.
If Optional object is empty, just skip it.
*/

import java.util.List;
import java.util.Optional;

class T04_NotNullIntegersSummer {
    public static void main(String[] args) {
        ValueProvider2 provider = new ValueProvider2();
        List<Optional<Integer>> optNumbers = provider.getValues();
        int sum = 0;
        for (Optional<Integer> optNumber : optNumbers) {
            if (optNumber.isPresent()) {
                sum += optNumber.get();
            }
        }
        System.out.println(sum);
    }
}

class ValueProvider2 {
    private List<Optional<Integer>> opts;

    public List<Optional<Integer>> getValues() {
        if (opts != null) {
            return opts;
        }

        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int number = scanner.nextInt();
        opts = java.util.stream.IntStream
                .rangeClosed(1, number)
                .mapToObj(n -> {
                    String val = scanner.next();
                    return "null".equals(val) ?
                            Optional.<Integer>empty() :
                            Optional.of(Integer.valueOf(val));
                })
                .collect(java.util.stream.Collectors.toList());

        return opts;
    }
}