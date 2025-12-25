package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L03_default_methods;

class Main {
    public static void main(String... args) {
        Printer2 printer = new ConsolePrinter();
        printer.print(); // prints: This is a default message
    }
}

class ConsolePrinter implements Printer2 {
}

interface Printer2 {
    default void print() {
        System.out.println("This is a default message");
    }
}
