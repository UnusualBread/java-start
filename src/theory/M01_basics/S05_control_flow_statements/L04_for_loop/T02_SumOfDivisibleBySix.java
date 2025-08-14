package theory.M01_basics.S05_control_flow_statements.L04_for_loop;

import java.util.Scanner;

/*
Find the sum of numbers divisible by 6 in the given sequence of
natural numbers.
The first line of the input is the number of elements in the
sequence; the next lines are the elements themselves.
*/

public class T02_SumOfDivisibleBySix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            sum = number % 6 == 0 ? sum + number : sum;
        }

        System.out.println(sum);

        scanner.close();
    }
}
