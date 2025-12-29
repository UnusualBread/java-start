package com.unusualbread.app.theory.M02_code_organization.S02_methods.L07_command_line_arguments;

/*
Write a program that accepts an array of command line arguments, searches for
the parameter named mode and displays its value. The Input is a sequence of
pairs: the parameter name is followed by the parameter's value.
*/

class Problem4 {
    public static void main(String[] args) {
        String value = "default";
        for (int i = 0; i < args.length; i += 2) {
            if ("mode".equals(args[i])) {
                value = args[i + 1];
                break;
            }
        }
        System.out.println(value);
    }
}
