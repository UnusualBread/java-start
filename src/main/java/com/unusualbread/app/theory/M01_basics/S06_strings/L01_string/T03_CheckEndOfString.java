package com.unusualbread.app.theory.M01_basics.S06_strings.L01_string;

import java.util.Scanner;

/*
Write a program that reads the name of a city
and checks if the name ends with "burg".
Keep in mind, a city can have a short name.
The program should output true or false.
*/

public class T03_CheckEndOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String cityName = scanner.nextLine();

        System.out.print(cityName.endsWith("burg"));

        scanner.close();
    }
}
