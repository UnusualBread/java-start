package C01_java.M01_basics.S03_simple_programs.L02_errors_in_programs;

/*
Given a program that reads one number and outputs it incremented by one.
Now the program cannot compile.
Fix all compile-time errors as well as logic-errors.
*/

import java.util.Scanner;

public class T01_NumberIncrementer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        System.out.println(++number);
    }
}
