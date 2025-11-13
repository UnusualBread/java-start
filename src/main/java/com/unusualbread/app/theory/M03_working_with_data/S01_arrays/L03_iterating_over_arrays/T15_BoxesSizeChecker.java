package com.unusualbread.app.theory.M03_working_with_data.S01_arrays.L03_iterating_over_arrays;

/*
There are two boxes on the table. The first box has a size of X1 x Y1 x Z1,
and the second box has a size of X2 x Y2 x Z2.

You need to determine whether one of the boxes can be put inside the other.
It should go in without sticking out.

To place one box within another, you can shift and rotate both boxes as you
want. This means that the order of integer inputs for a box is not important
while comparing the boxes.
*/

import java.util.Arrays;
import java.util.Scanner;

public class T15_BoxesSizeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] firstBox = new int[3];
        int[] secondBox = new int[3];

        for (int i = 0; i < 3; i++) {
            firstBox[i] = sc.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            secondBox[i] = sc.nextInt();
        }

        Arrays.sort(firstBox);
        Arrays.sort(secondBox);

        boolean canNest = true;

        for (int i = 0; i < 3; i++) {
            if (firstBox[i] >= secondBox[i]) {
                canNest = false;
                break;
            }
        }

        if (canNest) {
            System.out.println("Box 1 < Box 2");
        } else {
            canNest = true;

            for (int i = 0; i < 3; i++) {
                if (secondBox[i] >= firstBox[i]) {
                    canNest = false;
                    break;
                }
            }

            if (canNest) {
                System.out.println("Box 1 > Box 2");
            }
        }

        if (!canNest) {
            System.out.println("Incompatible");
        }

        sc.close();
    }
}
