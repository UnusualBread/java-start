package C02_java.M02_code_organization.S02_methods.L02_overloading;

/*
Write a program where you define two methods named 'calculate'. The first
method takes two integer values as input, multiplies them, and returns the
result. The second method takes three integer values as input, adds the first
two numbers, multiples the result with the third number, and returns it. Your
main program should call these methods based on the number of inputs provided.
You must read a string of integers from standard input. The string will either
have two or three integers separated by a space. Depending on the number of
numbers in the input, make a call to the appropriate method and print the
output.
*/

import java.util.Scanner;

public class T01_VariableCalculator {
    // Method to read input from user and separate the integers
    public static void processInputAndCallFunctions() {
        Scanner scn = new Scanner(System.in);
        String inputString = scn.nextLine();
        String[] strArr = inputString.split(" ");
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }

        int result;

        // Call the appropriate function depending on the number of integers in the input
        if (intArr.length == 2) {
            // Call calculate(int, int)
            result = calculate(intArr[0], intArr[1]);
            // TO DO: Fill in the appropriate code here
            System.out.println(result);
        } else if (intArr.length == 3) {
            // Call calculate(int, int, int)
            result = calculate(intArr[0], intArr[1], intArr[2]);
            // TO DO: Fill in the appropriate code here
            System.out.println(result);
        }

        scn.close();
    }

    public static int calculate(int a, int b) {
        return a * b;
    }

    public static int calculate(int a, int b, int c) {
        return (a + b) * c;
    }

    public static void main(String[] args) {
        processInputAndCallFunctions();
    }
}
