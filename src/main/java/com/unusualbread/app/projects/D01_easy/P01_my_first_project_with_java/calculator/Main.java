package com.unusualbread.app.projects.D01_easy.P01_my_first_project_with_java.calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bubblegum = 202;
        int toffee = 118;
        int iceCream = 2250;
        int milkChocolate = 1680;
        int doughnut = 1075;
        int pancake = 80;
        int income = bubblegum + toffee + iceCream + milkChocolate + doughnut + pancake;

        System.out.println("Earned amount:");
        System.out.printf("Bubblegum: $%d\n", bubblegum);
        System.out.printf("Toffee: $%d\n", toffee);
        System.out.printf("Ice cream: $%d\n", iceCream);
        System.out.printf("Milk chocolate: $%d\n", milkChocolate);
        System.out.printf("Doughnut: $%d\n", doughnut);
        System.out.printf("Pancake: $%d\n", pancake);
        System.out.println();
        System.out.printf("Income: $%d\n", income);
        System.out.println("Staff expenses:");

        Scanner sc = new Scanner(System.in);
        int staffExpenses = sc.nextInt();

        System.out.println("Other expenses:");
        int otherExpenses = sc.nextInt();
        sc.close();

        System.out.printf("Net income: $%d", income - staffExpenses - otherExpenses);
    }
}