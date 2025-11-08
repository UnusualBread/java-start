package theory.M04_errorless_code.S01_exception_handling.L06_throwing_exceptions;

/*
Modify the given method. It should throw an unchecked exception.
*/

public class T01_ExceptionThrower {

    public static void method() {
        throw new RuntimeException("Hello");
    }

    /* Do not change code below */
    public static void main(String[] args) {
        try {
            method();
        } catch (RuntimeException e) {
            System.out.println("RuntimeException");
        } catch (Exception e) {
            System.out.println("Exception");
        }
    }
}
