package C01_java.M01_basics.S05_control_flow_statements.L06_ternary_operator;

/*
Write a program that takes an integer as input. If the integer is positive,
print 'Positive'. If the integer is negative, print 'Negative'.
If the integer is zero, print 'Zero'.
*/

import java.util.Scanner;

public class T03_IntegerCategorizer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        System.out.println(number > 0 ? "Positive" : number < 0 ? "Negative" : "Zero");

        sc.close();
    }
}
