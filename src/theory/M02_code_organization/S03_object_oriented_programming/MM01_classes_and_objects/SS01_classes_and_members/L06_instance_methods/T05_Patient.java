package theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L06_instance_methods;

/*
Here's a class named Patient. It has one string field name.
You want to create a method that would allow your patient to call for a doctor.
Add the method say that prints the message containing the name of a patient
(instead of "...") and their request for a doctor:
*/

class Patient {

    String name;

    // write your method here
    public void say() {
        System.out.println("Hello, my name is " + this.name + ", I need a doctor.");
    }
}