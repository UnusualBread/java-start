package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L05_optional;

/*
Implement the method getValue of the InputStringReader class. It should read a
String value from the console and construct Optional<String> object based on
the value. If an input String equals empty, then create an empty Optional.
*/

import java.util.Optional;

class T02_OptionalPrinter {
    public static void main(String[] args) {
        InputStringReader reader = new InputStringReader();
        Optional<String> value = reader.getValue();
        value.ifPresentOrElse(
                s -> System.out.println("Value is present: " + s),
                () -> System.out.println("Value is empty")
        );
    }
}

class InputStringReader {
    public Optional<String> getValue() {
        String input = new java.util.Scanner(System.in).nextLine();
        return "empty".equals(input) ? Optional.empty() : Optional.of(input);
    }
}