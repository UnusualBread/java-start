package C01_java.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L06_instance_methods;

/*
You are given a class named Counter. Write two instance methods:
    1. inc that increases the value of the field current by one;
    2. getCurrent that returns the current value;
*/

class Counter {

    int current;

    // write your methods here
    public void inc() {
        this.current++;
    }

    public int getCurrent() {
        return current;
    }
}
