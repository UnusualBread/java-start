package com.unusualbread.app.theory.M01_basics.S05_control_flow_statements.L03_switch;

/*
Harry Potter needs help identifying what each house means.
Read a string representing a house and output the following:
    if it is "gryffindor", output "bravery";
    if it is "hufflepuff", output "loyalty";
    if it is "slytherin", output "cunning";
    if it is "ravenclaw", output "intellect";
    otherwise, output "not a valid house".
*/

import java.util.Scanner;

public class T03_HouseGetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String houseName = sc.nextLine();

        switch (houseName) {
            case "gryffindor":
                System.out.println("bravery");
                break;
            case "hufflepuff":
                System.out.println("loyalty");
                break;
            case "slytherin":
                System.out.println("cunning");
                break;
            case "ravenclaw":
                System.out.println("intellect");
                break;
            default:
                System.out.println("not a valid house");
        }

        sc.close();
    }
}
