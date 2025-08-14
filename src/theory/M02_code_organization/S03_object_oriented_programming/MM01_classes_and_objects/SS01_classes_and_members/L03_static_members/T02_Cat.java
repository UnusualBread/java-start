package theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L03_static_members;

/*
Let's count cats! Implement a class named Cat and a static method
getNumberOfCats.
These are some features of the class:
    - The class Cat has two instance fields: a string name and an int age, and
      one static int field counter. The static counter field allows you to know
      how many cats have already been created.
    - The class should have a constructor for initializing the instance fields.
      During the initialization of a new cat, the value of the static field
      counter should be incremented. If counter > 5, the message "You have too
      many cats" must be printed to System.out.
Your static method getNumberOfCats returns the current number of created cats
and prints no messages.
*/

class Cat {
    String name;
    int age;
    static int counter;

    public Cat(String name, int age) {
        counter++;
        if (counter > 5) {
            System.out.println("You have too many cats");
        }
        this.name = name;
        this.age = age;
    }

    public static int getNumberOfCats() {
        return counter;
    }
}
