package C01_java.M04_errorless_code.S01_exception_handling.L01_hierarchy_of_exceptions;

/*
Create a class named BadRequestException with the constructor that takes String
message as an argument and passes the message to the superclass. The
BadRequestException class must inherit from a checked exception.
*/

import java.io.IOException;

class BadRequestException extends IOException {
    BadRequestException(String message) {
        super(message);
    }
}