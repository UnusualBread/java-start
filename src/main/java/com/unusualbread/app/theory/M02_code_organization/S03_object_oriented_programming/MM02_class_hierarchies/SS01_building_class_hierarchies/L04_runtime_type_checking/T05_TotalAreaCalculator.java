package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L04_runtime_type_checking;

/*
Unfortunately, the author of this class hierarchy forgot to add the getArea()
method to these classes. Now you need to implement a method that calculates the
sum of areas of the Shape array. If some elements are instances of the class
Shape, their area equals 0.
*/

class Sum {
    public static int sumOfAreas(Shape3[] array) {
        int sum = 0;
        for (Shape3 shape : array) {
            switch (shape.getClass().getSimpleName()) {
                case "Square2":
                    sum += ((Square2) shape).getSide() * ((Square2) shape).getSide();
                    break;
                case "Rectangle":
                    sum += ((Rectangle) shape).getWidth() * ((Rectangle) shape).getHeight();
            }
        }
        return sum;
    }
}

//Don't change the code below
class Shape3 {
}

class Square2 extends Shape3 {
    private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

/*    public int getArea() {
        return side * side;
    }*/
}

class Rectangle extends Shape3 {
    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

/*    public int getArea() {
        return width * height;
    }*/
}
