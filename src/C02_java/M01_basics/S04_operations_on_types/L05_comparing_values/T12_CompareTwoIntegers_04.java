package C02_java.M01_basics.S04_operations_on_types.L05_comparing_values;

/*
Write a java program that scans two integer inputs, compares them and prints
if the first is less than, equal to or greater than the second one.
For comparison use these statements 'less than', 'equal to' and 'greater than'.
*/

import java.util.Scanner;

public class T12_CompareTwoIntegers_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();

        System.out.println(
                firstNumber > secondNumber ? "greater than" :
                        firstNumber == secondNumber ? "equal to" :
                                "less than");

        sc.close();
    }
}
