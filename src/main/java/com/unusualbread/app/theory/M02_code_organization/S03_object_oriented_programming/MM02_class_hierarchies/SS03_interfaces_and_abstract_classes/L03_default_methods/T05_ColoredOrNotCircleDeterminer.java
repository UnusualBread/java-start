package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L03_default_methods;

/*
Design two interfaces 'Shape' and 'Colorable'. The 'Shape' interface should
have a default method 'name()' that returns 'Generic Shape'. The 'Colorable'
interface should also have a default method 'color()' that returns 'No Color'.
Create a class 'Circle' that implements both the 'Shape' and 'Colorable'
interfaces. Override the 'name()' in 'Circle' to return 'Circle' and leave the
'color()' method as is. Then, create another class 'ColoredCircle' that extends
'Circle' and override 'color()' to return 'Red'. Your implementation should
take a string as input representing the type of object ('Circle' or
'ColoredCircle').
*/

import java.util.Scanner;

interface Shape {
    default String name() {
        return "Generic Shape";
    }
}

interface Colorable {
    default String color() {
        return "No Color";
    }
}

class Circle implements Shape, Colorable {
    public String name() {
        return "Circle";
    }
}

class ColoredCircle extends Circle {
    public String color() {
        return "Red";
    }
}

public class T05_ColoredOrNotCircleDeterminer {

    public static String nameAndColorDeterminer(String shape) {
        Circle circle = "Circle".equals(shape) ? new Circle() : new ColoredCircle();
        return circle.name() + "\n" + circle.color();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        System.out.println(nameAndColorDeterminer(input));
    }
}
