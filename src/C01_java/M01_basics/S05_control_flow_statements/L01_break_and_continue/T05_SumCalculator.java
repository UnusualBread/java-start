package C01_java.M01_basics.S05_control_flow_statements.L01_break_and_continue;

/*
Write a program that inputs a sequence of integer numbers in a loop and
calculates their sum under the following conditions:
1) if a new number is 0, the program must stop the loop and output the
accumulated sum;
2) if the sum is equal to or exceeds the limit of 1000, the program must
also stop reading the numbers and output the value equal to the sum minus 1000.
*/

import java.util.Scanner;

public class T05_SumCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0, number;

        do {
            number = sc.nextInt();
            sum += number;
        } while (number != 0 && sum < 1000);

        if (sum >= 1000) {
            sum -= 1000;
        }

        System.out.println(sum);

        sc.close();
    }
}
