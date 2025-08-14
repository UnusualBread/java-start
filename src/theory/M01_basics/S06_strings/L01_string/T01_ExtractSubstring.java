package theory.M01_basics.S06_strings.L01_string;

import java.util.Scanner;

/*
Write a program that reads a string and two integer numbers.
These two numbers are representing a range that includes them
both. Print the substring enclosed in this range. Both numbers
are always greater than or equal to 0 and less than the string
length.
*/

public class T01_ExtractSubstring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();

        String substr = str.substring(startIndex, endIndex + 1);
        System.out.println(substr);

        scanner.close();
    }
}
