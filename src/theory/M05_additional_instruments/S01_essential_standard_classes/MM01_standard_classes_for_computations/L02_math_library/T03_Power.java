package theory.M05_additional_instruments.S01_essential_standard_classes.MM01_standard_classes_for_computations.L02_math_library;

import java.util.Scanner;

public class T03_Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println(Math.pow(a, b));

        sc.close();
    }
}
