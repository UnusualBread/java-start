package theory.M01_basics.S05_control_flow_statements.L01_break_and_continue;

/*
Write a Java program that takes an integer as input, and iterates over all
integers from 1 up to the given number (both inclusive). When the number is
divisible by 5, your program should continue to the next number without
printing anything. For all other numbers, print the number, but if the number
is divisible by 7, then stop the iteration and print the number followed by
': stopped' immediately. Let's implement it.
*/

import java.util.Scanner;

public class T03_SelectivePrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        for (int i = 1; i <= totalNumbers; i++) {
            if (i % 5 == 0) {
                continue;
            }

            System.out.print(i);

            if (i % 7 == 0) {
                System.out.println(": stopped");
                break;
            }

            System.out.println();
        }

        sc.close();
    }
}
