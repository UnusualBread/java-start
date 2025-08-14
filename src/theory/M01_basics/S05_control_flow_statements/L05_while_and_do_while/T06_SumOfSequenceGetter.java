package theory.M01_basics.S05_control_flow_statements.L05_while_and_do_while;

/*
Find the sum of all elements of a sequence, ending with the number 0.
*/

import java.util.Scanner;

public class T06_SumOfSequenceGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int number;

        do {
            number = sc.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println(sum);

        sc.close();
    }
}
