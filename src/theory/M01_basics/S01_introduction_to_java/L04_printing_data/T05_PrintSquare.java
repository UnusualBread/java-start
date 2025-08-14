package theory.M01_basics.S01_introduction_to_java.L04_printing_data;

import java.util.Scanner;

/*
The following Java program was created to take an integer from the user
and square it. However, the developer was not familiar with printing outputs.
Update the code to print the square of the input number.
*/

public class T05_PrintSquare {
    public static void main(String[] args) {
        // Create a new scanner for user input
        Scanner sc = new Scanner(System.in);

        // Taking integer input from the user
        int number = sc.nextInt();

        // Calculating the square of the input
        int squared_number = number * number;

        // TODO: Print the result out
        System.out.println(squared_number);

        // Important to close the scanner!
        sc.close();
    }
}
