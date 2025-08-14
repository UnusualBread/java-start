package theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L06_instance_methods;

class Complex {

    double real;
    double image;

    // write methods here
    public void add(Complex num) {
        this.real += num.real;
        this.image += num.image;
    }

    public void subtract(Complex num) {
        this.real -= num.real;
        this.image -= num.image;
    }
}
