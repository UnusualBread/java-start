package C01_java.M01_basics.S04_operations_on_types.L02_characters;

/*
Write a program in Java that receives a character from the input and returns
the next character in the Unicode table. Your program should read a single
character from the input and print a single character as output.
*/

import java.util.Scanner;

public class T01_NextCharGetter {
    public static void main(String[] args) {
        // Create a new scanner object for user input
        Scanner input = new Scanner(System.in);

        // Waiting for user input
        char inputChar = input.next().charAt(0);

        // Perform operation on character here and print the result
        System.out.println(++inputChar);
    }
}
