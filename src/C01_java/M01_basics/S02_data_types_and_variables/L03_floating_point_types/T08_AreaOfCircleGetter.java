package C01_java.M01_basics.S02_data_types_and_variables.L03_floating_point_types;

/*
Given the radius of a circle, you need to find the area of that circle.
*/

import java.util.Scanner;

public class T08_AreaOfCircleGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();

        double area = Math.PI * Math.pow(radius, 2);

        System.out.println(area);

        sc.close();
    }
}
