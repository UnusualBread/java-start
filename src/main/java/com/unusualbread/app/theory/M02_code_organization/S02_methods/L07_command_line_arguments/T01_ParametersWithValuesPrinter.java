package com.unusualbread.app.theory.M02_code_organization.S02_methods.L07_command_line_arguments;

/*
Consider your program needs to get a few parameters to start working. For example, you want to specify a path on your drive where the program can store output files.

Write a program that takes command-line arguments in the format:
parameter1 value1 parameter2 value2

and outputs them in the standard output in the format:
parameter1=value1
parameter2=value2
*/

class Problem {
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i += 2) {
            System.out.printf("%s=%s\n", args[i], args[i + 1]);
        }
    }
}
