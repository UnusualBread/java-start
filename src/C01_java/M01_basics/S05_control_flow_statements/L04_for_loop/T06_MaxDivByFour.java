package C01_java.M01_basics.S05_control_flow_statements.L04_for_loop;

/*
Given a sequence of natural numbers, not exceeding 30000. Find the maximum
element divisible by 4. There is always an element divisible by 4 in the
sequence and the number of elements does not exceed 1000.

As input, the program receives the number of elements in the sequence n
(first line) and then the elements themselves (next n lines). The program
should print a single number: the maximum element
of the sequence divisible by 4.
*/

import java.util.Scanner;

public class T06_MaxDivByFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalNumbers = sc.nextInt();

        int max = 0;
        for (int i = 0; i < totalNumbers; i++) {
            int number = sc.nextInt();

            if (number % 4 == 0 & number > max) {
                max = number;
            }
        }

        System.out.println(max);

        sc.close();
    }
}
