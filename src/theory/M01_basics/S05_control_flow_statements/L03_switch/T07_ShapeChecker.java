package theory.M01_basics.S05_control_flow_statements.L03_switch;

/*
Write a program, which reads the number of the shape
(1 – square, 2 – circle, 3 – triangle, 4 – rhombus) and prints the text
"You have chosen a square"
(or circle, or triangle, or rhombus, depending on the number).
*/

import java.util.Scanner;

public class T07_ShapeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        String shape;
        String str = "You have chosen a ";

        switch (number) {
            case 1:
                shape = "square";
                System.out.println(str + shape);
                break;
            case 2:
                shape = "circle";
                System.out.println(str + shape);
                break;
            case 3:
                shape = "triangle";
                System.out.println(str + shape);
                break;
            case 4:
                shape = "rhombus";
                System.out.println(str + shape);
                break;
            default:
                System.out.println("There is no such shape!");
        }

        sc.close();
    }
}
