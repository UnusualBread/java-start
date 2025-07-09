package C01_java.M01_basics.S05_control_flow_statements.L01_break_and_continue;

/*
Given a sequence of natural numbers. Read numbers from the input, line by line,
and for each number print if it is even or odd; if the number 0 is entered,
don't print anything, immediately stop reading further numbers and terminate
your program.
*/

import java.util.Scanner;

public class T04_LinesOfParityPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();

        while (number != 0) {
            if (number % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("odd");
            }

            number = sc.nextInt();
        }

        sc.close();
    }
}
