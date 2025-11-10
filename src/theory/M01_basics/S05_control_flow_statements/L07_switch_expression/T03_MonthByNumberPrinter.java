package theory.M01_basics.S05_control_flow_statements.L07_switch_expression;

/*
Write a program that reads the number of the month (1-6) and outputs the name
*/

import java.util.Scanner;

public class T03_MonthByNumberPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        System.out.println(switch (number) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            default -> "error!";
        });
    }
}
