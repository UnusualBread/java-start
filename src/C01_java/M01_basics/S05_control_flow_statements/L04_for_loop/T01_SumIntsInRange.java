package C01_java.M01_basics.S05_control_flow_statements.L04_for_loop;

import java.util.Scanner;

/*
Print the sum of all integers from a to b including both.
It is guaranteed that a < b in all test cases.
*/

public class T01_SumIntsInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();

        int sum = 0;

        for (int i = startNumber; i < endNumber + 1; i++) {
            sum += i;
        }

        System.out.println(sum);

        scanner.close();
    }
}
