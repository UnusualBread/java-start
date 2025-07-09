package C02_java.M01_basics.S05_control_flow_statements.L03_switch;

/*
Write a program that calculates the floor area of the rooms.

Input data format:
The type of the room shape and the relevant parameters.

Output data format:
The area of the resulting room.
*/

import java.util.Scanner;

public class T02_ShapesAreaGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String shape = sc.nextLine();

        double a, b, c, r, area, semiPerimeter;

        switch (shape) {
            case "triangle":
                a = sc.nextInt();
                b = sc.nextInt();
                c = sc.nextInt();
                semiPerimeter = (a + b + c) / 2;
                area = Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
                System.out.println(area);
                break;
            case "rectangle":
                a = sc.nextInt();
                b = sc.nextInt();
                area = a * b;
                System.out.println(area);
                break;
            case "circle":
                r = sc.nextInt();
                area = 3.14 * (r * r);
                System.out.println(area);
                break;
        }

        sc.close();
    }
}
