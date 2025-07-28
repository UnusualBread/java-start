package C01_java.M04_errorless_code.S01_exception_handling.L03_exception_handling;

/*
Consider a method that takes a string and converts it to a double. If the input
string happens to be null or of an unsuitable format, a runtime exception
occurs and the program fails.

Fix the method so it would catch any exception and return the default value 0 (zero) if an exception occurred.
*/

import java.util.Scanner;

class Converter {
    public static double convertStringToDouble(String input) {
        try {
            return Double.parseDouble(input);
        } catch (RuntimeException e) {
            return 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();

        System.out.println(convertStringToDouble(str));
    }
}