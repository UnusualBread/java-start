package theory.M04_errorless_code.S01_exception_handling.L01_hierarchy_of_exceptions;

/*
Create a class named MyException, which must inherit from the base class for
all exceptions and errors. Inside the MyException class declare a constructor
that takes String message as an argument and passes the message to the
superclass.
*/

class MyException extends Throwable{
    MyException(String message) {
        super(message);
    }
}

class T03_MyException {
    public static void main(String[] args) {
        MyException myException = new MyException("This is a custom exception");
        System.out.println(myException.getMessage());
        Class<?> superClass = myException.getClass().getSuperclass();
        System.out.println(superClass.equals(Throwable.class));
    }
}
