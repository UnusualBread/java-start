package C01_java.M01_basics.S04_operations_on_types.L05_comparing_values;

/*
Write a program that reads three numbers and checks that
they all are different, i.e. not equal to one another.
*/

import java.util.Scanner;

public record T06_AreNumbersDifferent() {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();

        System.out.println(firstNumber != secondNumber && firstNumber != thirdNumber && secondNumber != thirdNumber);

        sc.close();
    }
}
