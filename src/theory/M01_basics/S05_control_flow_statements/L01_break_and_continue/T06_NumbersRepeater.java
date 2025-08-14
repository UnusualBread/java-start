package theory.M01_basics.S05_control_flow_statements.L01_break_and_continue;

/*
Write a program that prints a part of the sequence
1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 ... (the number is repeated as many times,
to what it equals to). The input to the program is a positive integer n:
the number of the elements of the sequence the program should print.
Output the sequence of numbers, written in a single line, space-separated.
*/

import java.util.Scanner;

public class T06_NumbersRepeater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalElements = sc.nextInt();
        int printedCount = 0;
        boolean stopFlag = false;

        for (int i = 1; i <= totalElements; i++) {
            for (int j = 0; j < i; j++) {
                printedCount++;
                if (printedCount > totalElements) {
                    stopFlag = true;
                    break;
                }

                System.out.print(i + " ");
            }

            if (stopFlag) {
                break;
            }
        }

        sc.close();
    }
}
