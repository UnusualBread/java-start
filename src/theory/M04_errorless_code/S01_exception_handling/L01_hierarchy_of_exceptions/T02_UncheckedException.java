package theory.M04_errorless_code.S01_exception_handling.L01_hierarchy_of_exceptions;

/*
Create a class named UncheckedException, which must inherit from an unchecked
exception. Inside the UncheckedException class declare a no-argument constructor.
*/

class UncheckedException extends RuntimeException{

}

class T02_UncheckedException {
    public static void main(String[] args) {
        UncheckedException uncheckedException = new UncheckedException();
        System.out.println(uncheckedException instanceof RuntimeException);
    }
}
