package C01_java.M01_basics.S04_operations_on_types.L04_boolean_type;

import java.util.Scanner;

/*
You are given an integer as input. Your task is to determine whether
the number is even or odd. If the number is even, print 'true'.
Otherwise, print 'false'.
*/

public class T01_EvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number % 2 == 0);

        scanner.close();
    }
}
