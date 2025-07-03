package C01_java.M01_basics.S05_control_flow_statements.L04_for_loop;

/*
Write a program that reads two numbers a and b from the keyboard and calculates
 and outputs to the console the arithmetic average of all numbers
 from the interval [a;b], which are divisible by 3.
*/

import java.util.Scanner;

public class T07_ArithmeticAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leftInterval = sc.nextInt();
        int rightInterval = sc.nextInt();

        double sum = 0;
        int count = 0;

        for (int i = leftInterval; i <= rightInterval; i++) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }

        double average = sum / count;

        System.out.println(average);

        sc.close();
    }
}
