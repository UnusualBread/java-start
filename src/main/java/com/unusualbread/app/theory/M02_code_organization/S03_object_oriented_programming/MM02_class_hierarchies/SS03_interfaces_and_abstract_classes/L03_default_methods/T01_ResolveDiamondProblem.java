package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L03_default_methods;

/*
Resolve a diamond problem of ConsoleWriter class. Override greeting method
according to Printer interface implementation. Try to avoid code duplication.
*/

class ConsoleWriter implements Printer, Notifier {
    public void greeting() {
        Printer.super.greeting();
    }
}

interface Printer {
    default void greeting() {
        System.out.println("Printer is ready");
    }
}

interface Notifier {
    default void greeting() {
        System.out.println("Notifier is ready");
    }
}
