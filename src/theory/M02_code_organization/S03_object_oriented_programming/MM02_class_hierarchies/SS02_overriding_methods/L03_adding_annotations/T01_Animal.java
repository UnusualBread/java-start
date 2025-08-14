package theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS02_overriding_methods.L03_adding_annotations;

/*
Create two classes named 'Animal' and 'Dog'. 'Animal' should have a single
method 'makeSound' which when called, returns the string 'animal sound'. 'Dog'
should be a subclass of 'Animal' and it should override the 'makeSound' method
such that when the method 'makeSound' is called on an instance of 'Dog', it
returns 'bark'.
*/

import java.util.Scanner;

// Animal class
class Animal {
    public String makeSound() {
        // Method to return animal sound
        return "animal sound";
    }
}

// Dog class
class Dog extends Animal {
    // Write override annotation and the makeSound method here
    @Override
    public String makeSound() {
        return "bark";
    }
}


public class T01_Animal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String animalType = scanner.nextLine();

        // Depending on the input create instance of Animal or Dog and call it's makeSound method
        if (animalType.equals("Animal")) {
            Animal animal = new Animal();
            System.out.println(animal.makeSound());
        } else if (animalType.equals("Dog")) {
            Dog dog = new Dog();
            System.out.println(dog.makeSound());
        }
    }
}