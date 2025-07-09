package C01_java.M01_basics.S05_control_flow_statements.L03_switch;

/*
Write a Java program that reads a code (1-3) for a traffic
signal and responds with the corresponding color.
*/

import java.util.Scanner;

public class T06_TrafficSignalDecoder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        switch (number) {
            case 1:
                System.out.println("Green");
                break;
            case 2:
                System.out.println("Yellow");
                break;
            case 3:
                System.out.println("Red");
                break;
            default:
                System.out.println("Invalid");
        }

        sc.close();
    }
}
