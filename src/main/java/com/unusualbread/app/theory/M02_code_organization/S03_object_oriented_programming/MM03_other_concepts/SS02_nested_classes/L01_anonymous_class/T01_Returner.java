package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM03_other_concepts.SS02_nested_classes.L01_anonymous_class;

/*
You should create an anonymous class that implements the interface and assign
the instance to the variable returner. The anonymous class must override both
methods of the interface. The method returnString should capture the string
variable str from the context and return it, the second method should capture
the integer variable number from the context and return it.
*/

import java.util.Scanner;

public class T01_Returner {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);
        final String str = scanner.nextLine();
        final int number = Integer.parseInt(scanner.nextLine());

        Returner returner = new Returner() {
            @Override
            public String returnString() {
                return str;
            }

            @Override
            public int returnInt() {
                return number;
            }
        };

        System.out.println(returner.returnString());
        System.out.println(returner.returnInt());
    }
}

interface Returner {

    public String returnString();

    public int returnInt();
}
