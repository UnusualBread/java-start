package com.unusualbread.app.theory.M02_code_organization.S07_functional_programming.MM01_functions.L04_standard_functional_interfaces;

/*
Create a supplier that returns integer values from 0 to infinity.

At the first get() invocation the supplier must return 0. After the second one,
it must return 1, the next one returns 2, 3, etc.

Also, it should be possible to use separate suppliers simultaneously.
*/

import java.util.Scanner;
import java.util.function.*;

class FunctionUtils {

    public static Supplier<Integer> getInfiniteRange() {
        return new Supplier<>() {
            private int count = 0;

            @Override
            public Integer get() {
                return count++;
            }
        };
    }
}

public class T02_NumbersPrinter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int threshold = sc.nextInt();

        Supplier<Integer> sup1 = FunctionUtils.getInfiniteRange();

        for (int i = 0; i < threshold; i++) {
            System.out.print(sup1.get() + " ");
        }

        System.out.println();

        sup1 = FunctionUtils.getInfiniteRange();
        Supplier<Integer> sup2 = FunctionUtils.getInfiniteRange();

        for (int i = 0; i < threshold; i++) {
            System.out.print(sup1.get() + " " + sup2.get() + " ");
        }
    }
}
