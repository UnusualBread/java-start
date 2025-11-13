package com.unusualbread.app.theory.M01_basics.S05_control_flow_statements.L04_for_loop;

import java.util.Scanner;

/*
Write a program that prints the product of
all integer numbers from a to b (a < b).
Include a and exclude b from the product.
*/

public class T04_ProductOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int startNumber = scanner.nextInt();
        int endNumber = scanner.nextInt();

        int product = 1;
        for (int i = startNumber; i < endNumber; i++) {
            product *= i;
        }

        System.out.println(product);

        scanner.close();
    }
}
