package C01_java.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS02_overriding_methods.L02_method_overriding;

/*
You have five classes: Shape, Triangle, Circle, Square, and Rectangle. The
class Shape has a method area(). This method does nothing. Override the method
in all subclasses. Overridden methods should return an area of a particular
figure.
*/

class Shape {
    public double area() {
        return 0;
    }
}

class Triangle extends Shape {
    double height;
    double base;

    // override the method here
    @Override
    public double area() {
        return height * base / 2;
    }
}

class Circle extends Shape {
    double radius;

    // override the method here
    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}

class Square extends Shape {
    double side;

    // override the method here
    @Override
    public double area() {
        return side * side;
    }
}

class Rectangle extends Shape {
    double width;
    double height;

    // override the method here
    @Override
    public double area() {
        return width * height;
    }
}
