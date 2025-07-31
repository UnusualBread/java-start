package C01_java.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS03_interfaces_and_abstract_classes.L01_abstract_class;

/*
You are given an abstract class IntBinaryOperation. It has one abstract method
perform() and two fields representing the operation arguments. The fields are
initialized in the constructor. See the provided code template.

You need to declare and implement two classes representing concrete operations:
Addition and Multiplication. The classes must extend the abstract class and
implement the method perform(). The implementations should work in accordance
with the class name.
*/

abstract class IntBinaryOperation {

    protected int firstArg;
    protected int secondArg;

    public IntBinaryOperation(int firstArg, int secondArg) {
        this.firstArg = firstArg;
        this.secondArg = secondArg;
    }

    public abstract int perform();
}

// declare and implement your classes here
class Addition extends IntBinaryOperation {
    public Addition(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return super.firstArg + super.secondArg;
    }
}

class Multiplication extends IntBinaryOperation {
    public Multiplication(int firstArg, int secondArg) {
        super(firstArg, secondArg);
    }

    @Override
    public int perform() {
        return super.firstArg * super.secondArg;
    }
}