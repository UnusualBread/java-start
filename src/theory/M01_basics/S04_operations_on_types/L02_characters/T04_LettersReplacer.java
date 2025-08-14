package theory.M01_basics.S04_operations_on_types.L02_characters;

/*
Write a program that reads a string and replaces
all occurrences of the letter 'a' with the letter 'b'.
*/

import java.util.Scanner;

public class T04_LettersReplacer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(str.replace('a', 'b'));

        sc.close();
    }
}
