package theory.M04_errorless_code.S01_exception_handling.L06_throwing_exceptions;

/*
Modify the given method. It should throw a checked exception.
*/

public class T04_ExceptionThrower_03 {

    public static void method() throws Exception {
        throw new Exception();
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
