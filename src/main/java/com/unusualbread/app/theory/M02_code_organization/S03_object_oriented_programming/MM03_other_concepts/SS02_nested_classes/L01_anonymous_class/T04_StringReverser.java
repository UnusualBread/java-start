package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM03_other_concepts.SS02_nested_classes.L01_anonymous_class;

/*
You should create an anonymous class that implements the interface and assign
the instance to the variable reverser. The anonymous class must override the
method reverse of the interface. It should return the reversed input string.
*/

import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        StringReverser reverser = new StringReverser() {

            @Override
            public String reverse(String str) {
                return new StringBuilder(str).reverse().toString();
            }
        };

        System.out.println(reverser.reverse(line));
    }

    interface StringReverser {

        String reverse(String str);
    }

}
