package C01_java.M01_basics.S03_simple_programs.L01_reading_via_scanner;

import java.util.Scanner;

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
