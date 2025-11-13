package com.unusualbread.app.theory.M01_basics.S03_simple_programs.L03_formatted_output;

/*
You are given a string which represents the name of a person and an int which
represents the person's height in centimeters. Your task is to create a java
program that can take these inputs and print a statement like this: "Hello, my
name is (name) and I am (height) cm tall."
*/

import java.util.Scanner;

public class T01_GreetingPrinter {
    public static void main(String[] args) {
        // Create a Scanner object which will allow us to read input from the console
        Scanner scanner = new Scanner(System.in);

        // Use the Scanner's nextLine method to read a line of input
        String name = scanner.nextLine();

        // Use the Scanner's nextInt method to read the next integer
        int height = scanner.nextInt();

        // TODO: Print the given statement replacing the placeholders with given inputs using formatted string.
        System.out.printf("Hello, my name is %s and I am %d cm tall.", name, height);

        scanner.close();
    }
}
