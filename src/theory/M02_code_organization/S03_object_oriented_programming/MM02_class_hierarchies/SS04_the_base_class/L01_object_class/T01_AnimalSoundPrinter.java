package theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS04_the_base_class.L01_object_class;

/*
You need to create a basic hierarchy of classes in Java to represent different
types of Animals. In this system, animals have a name and a method called sound
which returns the sound the animal makes. A Dog is an animal, and it barks. A
Cat on the other hand meows. You will receive an animal type and a name as
inputs. Depending on the animal type, instantiate the appropriate animal object
with the given name and print out its sound. If the animal type does not exist
in your system, just print out 'Animal type not recognized'.
*/

import java.util.*;

public class T01_AnimalSoundPrinter {

    private static class Animal {
        final String name;

        public Animal(String name) {
            this.name = name;
        }

        public void printSound() {
            System.out.println();
        }
    }

    private static class Dog extends Animal {
        public Dog(String name) {
            super(name);
        }

        @Override
        public void printSound() {
            System.out.println("Bark!");
        }
    }

    private static class Cat extends Animal {
        public Cat(String name) {
            super(name);
        }

        @Override
        public void printSound() {
            System.out.println("Meow!");
        }
    }

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String animalType = sc.nextLine();
        String animalName = sc.nextLine();

        if("Dog".equals(animalType)) {
            Animal animal = new Dog(animalName);
            animal.printSound();
        } else if("Cat".equals(animalType)) {
            Animal animal = new Cat(animalName);
            animal.printSound();
        } else {
            System.out.println("Animal type not recognized");
        }
    }
}