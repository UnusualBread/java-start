package C01_java.M01_basics.S05_control_flow_statements.L06_ternary_operator;

import java.util.Scanner;

/*
Write a program that receives an integer as input,
if the integer is even return 'even' else return 'odd'.
*/

public class T01_ParityDeterminant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(number % 2 == 0 ? "even" : "odd");

        scanner.close();
    }
}
