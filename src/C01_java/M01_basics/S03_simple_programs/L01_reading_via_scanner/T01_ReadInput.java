package C01_java.M01_basics.S03_simple_programs.L01_reading_via_scanner;

import java.util.Scanner;

/*Create a program that accepts a user's name and age as input and prints out
a welcome message to the user, referencing their name and age. If the user's
name is 'John' and their age is '22', the program should print
'Hello, I am John! I am 22 years old.'
 */

public class T01_ReadInput {
    public static void main(String[] args) {
        // Initialize the Scanner object to receive user input
        Scanner sc = new Scanner(System.in);

        // Write your code for receiving user's name and age here.
        String name = sc.nextLine();
        int age = sc.nextInt();

        // Print the message using the user's name and age.
        System.out.print("Hello, I am " + name + "! I am " + age + " years old.");

        sc.close();
    }
}
