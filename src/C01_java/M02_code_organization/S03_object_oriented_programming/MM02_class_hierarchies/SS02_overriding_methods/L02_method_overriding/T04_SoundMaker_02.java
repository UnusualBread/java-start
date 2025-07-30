package C01_java.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS02_overriding_methods.L02_method_overriding;

/*
Create a base class called Animal with a method makeSound() that prints a
generic sound. Then create two subclasses, Cat and Dog, that override the
makeSound() method to print "Meow" and "Woof" respectively. Your program should
take an integer as input, create an object of the corresponding subclass (1 for
Cat, 2 for Dog), and call its makeSound() method.
*/

import java.util.Scanner;

public class T04_SoundMaker_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int animalType = scanner.nextInt();

        Animal2 animal;

        if (animalType == 1) {
            animal = new Cat2();
        } else if (animalType == 2) {
            animal = new Dog2();
        } else {
            animal = new Animal2();
        }

        animal.makeSound();
    }
}

class Animal2 {
    public void makeSound() {
        System.out.println("Generic sound");
    }
}

class Cat2 extends Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}

class Dog2 extends Animal2 {
    @Override
    public void makeSound() {
        System.out.println("Woof");
    }
}
