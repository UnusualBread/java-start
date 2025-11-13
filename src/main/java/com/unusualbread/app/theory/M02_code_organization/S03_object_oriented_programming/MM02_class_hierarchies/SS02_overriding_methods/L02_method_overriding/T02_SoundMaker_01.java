package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS02_overriding_methods.L02_method_overriding;

/*
You have four classes: Animal, Cat, Dog, and Duck. The class animal has a
method say().
Override the method in all subclasses. Overridden methods should output what
these animals say (using System.out.println).
*/

class Animal {

    public void say() {
        System.out.println("...An incomprehensible sound...");
    }
}

class Cat extends Animal {
    @Override
    public void say() {
        System.out.println("meow-meow");
    }
}

class Dog extends Animal {
    @Override
    public void say() {
        System.out.println("arf-arf");
    }
}

class Duck extends Animal {
    @Override
    public void say() {
        System.out.println("quack-quack");
    }
}
