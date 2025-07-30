package C01_java.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS02_overriding_methods.L02_method_overriding;

/*
Suppose you have two classes: "Animal" and "Dog". The class "Animal" has a
method "speak()" that returns a String "Animal sound...". The class "Dog" is a
subclass of "Animal", but the method "speak()" in the "Dog" class should return
"Bark!". However, there's also a static method in the "Dog" class called
"main()", which creates a Dog object named "fido" and prints the result of
calling "speak()" on "fido". Please write the Java code to implement this.
*/

public class T06_SoundMaker_03 {
    public static void main(String[] args) {
        // Your code here
        Animal3 fido = new Dog3();

        System.out.println(fido.speak());
    }
}

class Animal3 {
    public String speak() {
        // Your code here
        return "Animal sound...";
    }
}

class Dog3 extends Animal3 {
    public String speak() {
        // Your code here
        return "Bark!";
    }
}