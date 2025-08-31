package theory.M05_additional_instruments.S01_essential_standard_classes.MM01_standard_classes_for_computations.L02_math_library;

import java.util.Scanner;

import static java.lang.Math.*;

public class T01_AngleBetweenVectorsGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        System.out.println(round(toDegrees(acos((x1 * x2 + y1 * y2) / (abs(hypot(x1, y1)) * abs(hypot(x2, y2)))))));

        sc.close();
    }
}
