package theory.M01_basics.S05_control_flow_statements.L03_switch;

/*
Write a program, which reads the number of direction (1 – up, 2 – down,
3 – left, 4 – right, 0 – do not move) and outputs the text "move up"
(or "move down", or "move left", or "move right", or "do not move"
depending on the entered number). If it is a number that does not belong
to any of the listed directions, the program should output "error!"
*/

import java.util.Scanner;

public class T08_DirectionFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("move up");
                break;
            case 2:
                System.out.println("move down");
                break;
            case 3:
                System.out.println("move left");
                break;
            case 4:
                System.out.println("move right");
                break;
            case 0:
                System.out.println("do not move");
                break;
            default:
                System.out.println("error!");
        }

        sc.close();
    }
}
