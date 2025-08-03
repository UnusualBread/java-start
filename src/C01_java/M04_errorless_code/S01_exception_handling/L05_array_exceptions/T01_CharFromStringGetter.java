package C01_java.M04_errorless_code.S01_exception_handling.L05_array_exceptions;

/*
Take a look at the program that reads a string and a number N and outputs the
Nth element of a string (starting from 0).
This program may throw StringIndexOutOfBoundsException. Fix it to avoid the
exception.
*/

import java.util.*;

class T01_CharFromStringGetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String string = scanner.nextLine();
        int index = scanner.nextInt();
        scanner.close();

        try {
            System.out.println(string.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Out of bounds!");
        }
    }
}
