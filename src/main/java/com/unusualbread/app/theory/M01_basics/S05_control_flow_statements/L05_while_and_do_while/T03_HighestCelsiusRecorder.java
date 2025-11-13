package com.unusualbread.app.theory.M01_basics.S05_control_flow_statements.L05_while_and_do_while;

/*
Write a Java program that reads a sequence of temperature readings in degrees
Celsius until a reading of 100 degrees or more is encountered. Your program
should output the highest temperature reading observed up to that point.
You must take input as a sequence of integer temperature values and print the
highest value before the stopping condition.
*/

import java.util.Scanner;

public class T03_HighestCelsiusRecorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int celsius = sc.nextInt(), max = 0;
        while (celsius < 100) {
            if (celsius > max) {
                max = celsius;
            }

            celsius = sc.nextInt();
        }

        System.out.println(max);

        sc.close();
    }
}
