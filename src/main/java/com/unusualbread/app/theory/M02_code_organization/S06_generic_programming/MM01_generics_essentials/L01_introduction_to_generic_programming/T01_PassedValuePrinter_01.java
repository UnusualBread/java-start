package com.unusualbread.app.theory.M02_code_organization.S06_generic_programming.MM01_generics_essentials.L01_introduction_to_generic_programming;

/*
Correct the code to make it compilable. The program should print:
"Passed value: value"
*/

class T01_PassedValuePrinter_01 {
    public static void main(String... args) {
        Printer<String> printer = new Printer<>();

        printer.set("value");
        printer.print();
    }
}

class Printer<T> {
    private T value;

    void set(T value) {
        this.value = value;
    }

    void print() {
        System.out.println("Passed value: " + value);
    }
}
