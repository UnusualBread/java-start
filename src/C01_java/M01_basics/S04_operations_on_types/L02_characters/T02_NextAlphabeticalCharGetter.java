package C01_java.M01_basics.S04_operations_on_types.L02_characters;

/*
Given a lowercase character, write a program that prints the next character in
the alphabet. If the input character is 'z', print 'a'.
*/

import java.util.Scanner;

public class T02_NextAlphabeticalCharGetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input character
        char inputChar = scanner.next().charAt(0);

        // TODO: Write your code here
        inputChar++;
        char outputChar = (char) ((inputChar - 97) % 26 + 97);

        // Print the result
        System.out.println(outputChar);
    }
}
