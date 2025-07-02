package C01_java.M01_basics.S04_operations_on_types.L05_comparing_values;

/*
Write a program that reads the numbers a, b, c and checks
if there's a pair of them that adds up to exactly 20.
*/

import java.util.Scanner;

public class T11_IsSumTwenty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        System.out.println(firstNumber + secondNumber == 20 || firstNumber + thirdNumber == 20 || secondNumber + thirdNumber == 20);

        sc.close();
    }
}
