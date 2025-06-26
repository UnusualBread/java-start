package C01_java.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

import java.util.Scanner;

/*
Write a Java program that reads a positive integer from the user, representing
a duration in minutes. The program should calculate and print the equivalent
time duration in hours and minutes. If the input is 367 for example, the
output should be '6 hours and 7 minutes'.
*/

public class T04_ConvertTime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        int hours = minutes / 60;
        minutes %= 60;

        System.out.printf("%d hours and %d minutes", hours, minutes);

        scanner.close();
    }
}
