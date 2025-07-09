package C02_java.M01_basics.S05_control_flow_statements.L02_conditional_statement;

/*
Find whether a given year is a leap year.
*/

import java.util.Scanner;

public class T07_IsLeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }

        sc.close();
    }
}
