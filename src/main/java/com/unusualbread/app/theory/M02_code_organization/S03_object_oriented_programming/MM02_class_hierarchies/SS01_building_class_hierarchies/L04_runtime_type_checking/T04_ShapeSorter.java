package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L04_runtime_type_checking;

/*
You are given 4 classes — Shape, Polygon, Square, Circle.

Classes Polygon and Circle both extend the class Shape, the class Square
extends the class Polygon.

You need to implement a method that takes Shape array and adds every element to
one of the provided Lists based on their class.
*/

import java.util.List;

class Sort {
    public static void sortShapes(Shape2[] array,
                                  List<Shape2> shapes,
                                  List<Polygon> polygons,
                                  List<Square> squares,
                                  List<Circle2> circles) {
        for (Shape2 shape : array) {
            switch (shape.getClass().getSimpleName()) {
                case "Shape2":
                    shapes.add(shape);
                    break;
                case "Polygon":
                    polygons.add((Polygon) shape);
                    break;
                case "Square":
                    squares.add((Square) shape);
                    break;
                case "Circle2":
                    circles.add((Circle2) shape);
            }
        }
    }
}

//Don't change classes below
class Shape2 { }
class Polygon extends Shape2 { }
class Square extends Polygon { }
class Circle2 extends Shape2 { }
