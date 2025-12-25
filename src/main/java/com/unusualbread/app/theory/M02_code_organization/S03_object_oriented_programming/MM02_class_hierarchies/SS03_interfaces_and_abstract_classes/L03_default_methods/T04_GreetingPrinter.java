package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L03_default_methods;

/*
Create an interface called 'Greetings' with a default method 'greet' that takes
a name as input and returns a greeting message. Then create a class
'GreetingsImpl' that implements the 'Greetings' interface. The program should
read a name from the user, create an instance of 'GreetingsImpl', and print the
greeting message returned by calling the 'greet' method.
*/

import java.util.Scanner;

interface Greetings {
    default String greet(String name) {
        return "Hello, %s!".formatted(name);
    }
}

class GreetingsImpl implements Greetings {
    public String greet(String name) {
        return "Hello, %s!".formatted(name);
    }
}

public class T04_GreetingPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        Greetings greetings = new GreetingsImpl();
        String greeting = greetings.greet(name);
        System.out.println(greeting);
    }
}
