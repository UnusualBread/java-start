package theory.M01_basics.S03_simple_programs.L02_errors_in_programs;

/*
Here's a program that reads an integer age and outputs a string with this
integer. But something is broken in the code!
Fix all compile-time errors in the snippet and make it work.
*/

import java.util.Scanner;

public class T05_AgePrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        System.out.printf("My age is %d", age);
    }
}
