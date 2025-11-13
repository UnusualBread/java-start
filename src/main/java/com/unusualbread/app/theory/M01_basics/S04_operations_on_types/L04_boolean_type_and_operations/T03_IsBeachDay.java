package com.unusualbread.app.theory.M01_basics.S04_operations_on_types.L04_boolean_type_and_operations;

/*
Develop a Java program that checks the advisability of going to the beach based
on the current weather conditions. The program will receive three boolean
inputs in sequence: isSunny, isRainy, and isCold. Your program should output
'true' if the weather is sunny and not rainy or cold, and 'false' otherwise.
*/

import java.util.Scanner;

public class T03_IsBeachDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isSunny = sc.nextBoolean();
        boolean isRainy = sc.nextBoolean();
        boolean isCold = sc.nextBoolean();

        System.out.println(isSunny && !isRainy && !isCold);

        sc.close();
    }
}
