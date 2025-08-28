package theory.M05_additional_instruments.S01_essential_standard_classes.MM01_standard_classes_for_computations.L02_math_library;

import java.util.Scanner;

public class T02_HeronsAreaGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        double p = (a + b + c) / 2.0;
        double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));

        System.out.println(area);

        sc.close();
    }
}
