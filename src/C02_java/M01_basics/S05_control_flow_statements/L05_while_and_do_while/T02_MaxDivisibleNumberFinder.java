package C02_java.M01_basics.S05_control_flow_statements.L05_while_and_do_while;

import java.util.Scanner;

/*
You are given a sequence of natural numbers. Find the maximum element
divisible by 4. The input is passed to the program as follows:

1. The first number is the total number of elements in the sequence.
   Use this number as a condition for your loop.
2. The upcoming numbers are part of the sequence which need to be evaluated.

The numbers in the sequence may or may not be evenly divisible by 4.
The program should print a single number: the maximum element of
the sequence that is evenly divisible by 4.

Try to solve this problem by using a while-loop.
*/

public class T02_MaxDivisibleNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();

        int i = 0, max = 0;
        while (i < numberOfElements) {
            int element = scanner.nextInt();
            max = element % 4 == 0 ? Math.max(element, max) : max;
            i++;
        }

        System.out.println(max);

        scanner.close();
    }
}
