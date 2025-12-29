package com.unusualbread.app.theory.M02_code_organization.S02_methods.L07_command_line_arguments;

/*
Write a program that searches for an argument equal to "test" (without quotes),
and then outputs its index in the array args. If it is not found, the program
must output "-1". This argument can occur no more than once.
*/

class Problem2 {
    public static void main(String[] args) {
        int foundIndex = -1;
        for (int i = 0; i < args.length; i++) {
            if ("test".equals(args[i])) {
                foundIndex = i;
                break;
            }
        }
        System.out.println(foundIndex);
    }
}