package C02_java.M01_basics.S04_operations_on_types.L05_comparing_values;

/*
Write a program that reads three integer numbers and prints true if the first
number is between the second and the third one (inclusive). Otherwise,
it must print false.
*/

import java.util.Scanner;

public class T09_IsBetween {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        System.out.println(firstNumber >= secondNumber && firstNumber <= thirdNumber || firstNumber <= secondNumber && firstNumber >= thirdNumber);

        sc.close();
    }
}
