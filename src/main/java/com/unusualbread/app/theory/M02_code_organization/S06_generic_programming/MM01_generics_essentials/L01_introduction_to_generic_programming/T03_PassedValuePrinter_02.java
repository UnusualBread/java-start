package com.unusualbread.app.theory.M02_code_organization.S06_generic_programming.MM01_generics_essentials.L01_introduction_to_generic_programming;

/*
Create a type-safe Box class that has a single instance variable for the type
it's defined with, alongside an appropriate constructor. Implement a method
named get that will return the value. Then, you will be provided with a string,
integer or a float. Your task is to put the provided value into an object of
Box and then print its value.
*/

import java.util.*;

public class T03_PassedValuePrinter_02 {
    static class Box<T> {

        private T t;

        public Box(T t) {
            this.t = t;
        }

        public T get() {
            return t;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            var printer = new Box<>(num);
            System.out.println(printer.get());
        } else if (sc.hasNextFloat()) {
            float num = sc.nextFloat();
            var printer = new Box<>(num);
            System.out.println(printer.get());
        } else {
            String str = sc.next();
            var printer = new Box<>(str);
            System.out.println(printer.get());
        }
    }
}
