package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM03_other_concepts.SS02_nested_classes.L01_anonymous_class;

/*
You should create an anonymous class that implements the given interface and
assign the instance to the variable instance. The anonymous class must override
the method doSomething so that it outputs "The anonymous class does something"
to the standard output.
*/

public class T03_SingleLinePrinter {

    public static void main(String[] args) {

        SingleMethodInterface instance = new SingleMethodInterface() {

            @Override
            public void doSomething() {
                System.out.println("The anonymous class does something");
            }
        };

        instance.doSomething();
    }
}

interface SingleMethodInterface {

    void doSomething();
}
