package C01_java.M01_basics.S05_control_flow_statements.L02_conditional_statement;

import java.util.Scanner;

/*
Given an input integer 'n', your program must output a string.
If 'n' is less than 5, output 'LOW'. If 'n' is exactly 5, output 'MID'.
If 'n' is greater than 5, output 'HIGH'.
*/

public class T03_DetermineRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n < 5) {
            System.out.println("LOW");
        } else if (n == 5) {
            System.out.println("MID");
        } else {
            System.out.println("HIGH");
        }

        scanner.close();
    }
}
