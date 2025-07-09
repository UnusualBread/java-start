package C02_java.M01_basics.S05_control_flow_statements.L06_ternary_operator;

import java.util.Scanner;

/*
Given a number, write a program in Java to determine whether this
number is equal to 10 or not. Your program should take a single
integer as input and print "Equal" if the number is 10, or
"Not Equal" otherwise.
*/

public class T02_EqualityOfTenChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number == 10 ? "Equal" : "Not Equal");

        scanner.close();
    }
}
