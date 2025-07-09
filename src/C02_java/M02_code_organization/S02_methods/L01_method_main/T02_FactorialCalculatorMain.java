package C02_java.M02_code_organization.S02_methods.L01_method_main;

import java.util.Scanner;

/*
Create a Java program that prompts the user for an integer 'n'
and prints the factorial of 'n'. Your program should consist of
a main method where all your logic resides. Assume the input integer
'n' is non-negative. The main method should read from the standard
input and print to the standard output.
*/

public class T02_FactorialCalculatorMain {

    // 3.0 No method main code here, user write their own
    public static int getFactorial(int n) {
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        return result;
    }

    public static void main(String[] args) {
        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // TODO: 1. Ask user for an integer 'n' using scanner.nextInt()
        int n = scanner.nextInt();

        // TODO: 2. Print the factorial of 'n'
        System.out.println(getFactorial(n));

        scanner.close(); // Always close the scanner when done
    }

}
