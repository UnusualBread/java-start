package com.unusualbread.app.theory.M01_basics.S04_operations_on_types.L07_increment_and_decrement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Given an integer n, print the value of n after applying the following operations:
increment n by 1, then decrement n by 2, then double the resulting value of n.
*/

public class T03_IncreaseAndDoubleInt {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // Read the integer input
        int n = Integer.parseInt(reader.readLine());

        // TODO: Increment n by 1
        n++;
        // TODO: Decrement nGiven an integer n, print the value of n after applying the following operations: increment n by 1, then decrement n by 2, then double the resulting value of n. by 2
        n -= 2;
        // TODO: Double the resulting value of n
        n *= 2;
        // Print the final value of n
        System.out.println(n);
    }
}
