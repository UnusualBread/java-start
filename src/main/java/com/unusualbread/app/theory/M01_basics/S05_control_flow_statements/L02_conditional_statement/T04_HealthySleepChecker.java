package com.unusualbread.app.theory.M01_basics.S05_control_flow_statements.L02_conditional_statement;

import java.util.Scanner;

/*
You are given three numbers:
A, B and H. According to TV, one should sleep at least A hours per day,
but no more than B hours. H is how many hours Ann sleeps.
Task: If Ann sleeps less than A hours, print "Deficiency".
If she sleeps more than B hours, print "Excess". If her sleep fits the
recommendations, print "Normal".
*/

public class T04_HealthySleepChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minHours = scanner.nextInt();
        int maxHours = scanner.nextInt();
        int realHours = scanner.nextInt();

        if (realHours >= minHours && realHours <= maxHours) {
            System.out.println("Normal");
        } else if (realHours < minHours) {
            System.out.println("Deficiency");
        } else {
            System.out.println("Excess");
        }

        scanner.close();
    }
}
