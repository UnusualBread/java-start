package com.unusualbread.app.theory.M01_basics.S05_control_flow_statements.L04_for_loop;

/*
Write a program that takes two integers as the input: the beginning and the end
of the interval (both numbers belong to the interval).

The program should output the numbers from this interval, but if the number is
divisible by 3, you should output Fizz instead of it; if the number is
divisible by 5, output Buzz; and if it is divisible both by 3 and by 5,
output FizzBuzz.
*/

import java.util.Scanner;

public class T08_FizzBuzzPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int leftInterval = sc.nextInt();
        int rightInterval = sc.nextInt();

        for (int i = leftInterval; i <= rightInterval; i++) {
            System.out.println(i % 3 == 0 ? i % 5 == 0 ? "FizzBuzz" : "Fizz" : i % 5 == 0 ? "Buzz" : i);
        }

        sc.close();
    }
}
