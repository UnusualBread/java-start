package C02_java.M01_basics.S05_control_flow_statements.L01_break_and_continue;

import java.util.Scanner;

/*
Write a program in Java that asks the user for a single input, an integer 'n'.
Your task is to print all even integers up to 'n'. However, if the integer 10
is encountered while printing, your program should skip the number 10 and the
five numbers that follow it. Then, continue printing the remaining even
numbers until 'n'.
*/

public class T01_EvenNumberPrinterWithSkip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberCount = scanner.nextInt();

        for (int i = 2; i < numberCount + 1; i++) {
            if (i >= 10 && i <= 15 || i % 2 != 0) {
                continue;
            }

            System.out.print(i + " ");
        }

        scanner.close();
    }
}
