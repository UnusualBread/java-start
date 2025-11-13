package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L01_Grouping_classes_with_packages;

/*
In this task, you simply need to implement the getString() method of
InputReader to read a whole line of input using the nextLine() method of
Scanner and return it as String.
*/

class InputReader {
    public static String getString() {
        return new java.util.Scanner(System.in).nextLine();
    }
}
