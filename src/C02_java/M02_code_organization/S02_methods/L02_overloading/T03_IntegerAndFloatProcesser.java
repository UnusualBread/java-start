package C02_java.M02_code_organization.S02_methods.L02_overloading;

/*
Develop a Java program designed to process both integers and floats.
When a float is passed to the 'process' method, it should be rounded
to the nearest whole number. When an integer is passed, it should be squared.
In both cases, the result should be printed to the console. The input to your
program will be a single integer or float value, and the output should be the
appropriate-processed value based on the input type.
*/

import java.util.Scanner;

public class T03_IntegerAndFloatProcesser {

    // Create a method named 'process' to handle integers
    // Hint: When dealing with integers, you should return the square of the number
    public static int process(int number) {
        return number * number;
    }

    // Create a method named 'process' to handle floats
    // Hint: When dealing with floats, you should return the number rounded to the nearest whole number
    public static int process(float number) {
        return Math.round(number);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read a line of input from the console
        String input = scanner.nextLine();

        try {
            Integer integerInput = Integer.parseInt(input);
            // Call the 'process' method with the integer input and print the result
            System.out.println(process(integerInput));
        } catch (NumberFormatException e) {
            Float floatInput = Float.parseFloat(input);
            // Call the 'process' method with the float input and print the result
            System.out.println(process(floatInput));
        }
    }
}
