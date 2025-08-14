package theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L01_abstract_class;

/*
You have an abstract class Shape with two abstract methods: getPerimeter() and
getArea(). See the provided code template.
You need to declare and implement three classes: Triangle, Rectangle and
Circle. The classes must extend the Shape class and implement all abstract
methods. To implement the methods the standard class Math may help you.
*/

abstract class Shape {

    abstract double getPerimeter();

    abstract double getArea();
}

class Triangle extends Shape {
    final double aSide;
    final double bSide;
    final double cSide;

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }

    @Override
    double getPerimeter() {
        return aSide + bSide + cSide;
    }

    @Override
    double getArea() {
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - aSide) * (semiPerimeter - bSide) * (semiPerimeter - cSide));
    }
}

class Rectangle extends Shape {
    final double width;
    final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    double getPerimeter() {
        return 2 * width + 2 * height;
    }

    @Override
    double getArea() {
        return width * height;
    }
}

class Circle extends Shape {
    final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}

