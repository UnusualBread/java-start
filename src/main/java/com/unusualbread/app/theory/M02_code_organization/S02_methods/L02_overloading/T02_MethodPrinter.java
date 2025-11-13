package com.unusualbread.app.theory.M02_code_organization.S02_methods.L02_overloading;

/*
Overload this method by writing a new method with the same name and
two arguments: a string and an integer. The new method should print
the name and both parameters
*/

import java.util.Scanner;

public class T02_MethodPrinter {

    public static void print(String strArg) {
        System.out.println("print(\"" + strArg + "\")");
    }

    // write your method here
    public static void print(String strArg, int intArg) {
        System.out.println("print(\"" + strArg + "\", " + intArg + ")");
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int val = scanner.nextInt();
        print(str);
        print(str, val);
    }
}
