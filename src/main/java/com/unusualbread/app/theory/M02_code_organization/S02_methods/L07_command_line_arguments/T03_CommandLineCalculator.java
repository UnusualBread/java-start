package com.unusualbread.app.theory.M02_code_organization.S02_methods.L07_command_line_arguments;

/*
Write a program that takes an operator ("+", "-", "*") and two integers as the
command-line arguments and then outputs the result of the operator in the
standard output. If the passed operator is not from the list, it must output
the string "Unknown operator" without quotes.
*/

class Problem3 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[1]);
        int b = Integer.parseInt(args[2]);

        System.out.println(switch (args[0]) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> "Unknown operator";
        });
    }
}