package C01_java.M01_basics.S04_operations_on_types.L01_integer_types_and_operations;

/*
N squirrels found K nuts and decided to divide them equally.
Determine how many nuts each squirrel will get.
*/

import java.util.Scanner;

public class T07_NutsCalculator_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int squirrelsNumber = sc.nextInt();
        int nutsNumber = sc.nextInt();

        int nutsForOne = nutsNumber / squirrelsNumber;

        System.out.println(nutsForOne);

        sc.close();
    }
}
