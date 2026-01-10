package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L05_optional;

/*
Write a code in the Main class that prints the returning value of the
provider.getValue if it is not null.
*/

import java.util.Optional;

class T01_IfPresentPrinter {
    public static void main(String[] args) {
        ValueProvider provider = new ValueProvider();
        provider.getValue().ifPresent(System.out::println);
    }
}

class ValueProvider {
    private String input = null;

    public Optional<String> getValue() {
        if (input == null) {
            java.util.Scanner scanner = new java.util.Scanner(System.in);
            String userInput = scanner.next();
            input = "null".equals(userInput) ? null : userInput;
        }

        return Optional.ofNullable(input);
    }
}