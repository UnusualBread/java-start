package C01_java.M01_basics.S04_operations_on_types.L05_comparing_values;

import java.util.Scanner;

/*
In Java, write a program that reads two integer values from the user and
compares them. If the first number is greater than the second, print "TRUE",
else print "FALSE". You should first scan an integer 'a' and then scan an
integer 'b'.
*/

public class T01_CompareTwoIntegers_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstInteger = scanner.nextInt();
        int secondInteger = scanner.nextInt();

        boolean isGreater = firstInteger > secondInteger;

        if (isGreater) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        scanner.close();
    }
}
