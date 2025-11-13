package com.unusualbread.app.theory.M01_basics.S01_introduction_to_java.L02_basic_literals;

public class T01_BasicLiterals {
    public static void main(String[] args){
        int numApples = 1000000;
        int numPackedApples = 1_000_000;

        System.out.println(numApples == numPackedApples);


        char charOne = '1';
        int numOne = 1;

        System.out.println(charOne == numOne);


        char singleQuoted = 'A';
        String doubleQuoted = "A";

        System.out.println("singleQuoted != doubleQuoted");


        int number = 42;
        String greeting = "Hello";

        System.out.println(number);
        System.out.println(greeting);
    }
}
