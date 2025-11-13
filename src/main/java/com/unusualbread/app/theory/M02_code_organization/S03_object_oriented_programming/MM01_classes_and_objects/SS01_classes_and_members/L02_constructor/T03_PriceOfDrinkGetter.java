package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L02_constructor;

/*
Create a class Drink with two attributes: a string 'name' and an integer
'price'. The class should have a constructor that initializes both
attributes. The constructor should accept two arguments: a string and an
integer respectively. Also, implement a method getPrice() that returns the
price of the drink. Write a program that initializes an instance of Drink and
prints the price of the drink. The input will be a string representing the name
of the drink and an integer representing the price of the drink. The output
should be the integer price of the drink.
*/

import java.util.Scanner;

public class T03_PriceOfDrinkGetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int price = scanner.nextInt();

        // create instance of the Drink class and print the cost of the drink
        Drink drink = new Drink(name, price);

        System.out.println(drink.getPrice());

        scanner.close();
    }
}

class Drink {
    // declare attributes
    private String name;
    private int price;

    // create constructor to initialize attributes
    public Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // create method getPrice that returns the price of the drink
    public int getPrice() {
        return this.price;
    }
}
