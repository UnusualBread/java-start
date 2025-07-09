package C02_java.M02_code_organization.S02_methods.L01_method_main;

/*
You're tasked with creating a simple Java method named 'countCharacters'.
This method will read a single string from the standard input. The string
would consist of any ASCII character. Your task is to calculate the total
number of characters in the string and print it out. For example, if the
input string was 'Hello, world!', your program should output '13'.
*/

import java.util.Scanner;

public class T06_StringLength {
    // Declare the method 'countCharacters'
    public static void countCharacters(String inputString) {
        // Your code here
        System.out.println(inputString.length());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();

        // Call 'countCharacters' method with the input string
        countCharacters(inputString);

        scanner.close();
    }
}
