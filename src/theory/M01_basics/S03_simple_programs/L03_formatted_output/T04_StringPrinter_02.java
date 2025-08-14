package theory.M01_basics.S03_simple_programs.L03_formatted_output;

/*
You've been tasked with using variables name, status, errorCode and methods
printf and format to display the following message:

Result of work - Lazy employee detected! Error code: 2

But something went wrong: there is an error in the code. Your task is to fix
the code and display the result.
*/

public class T04_StringPrinter_02 {
    public static void main(String[] args) {
        String name = "Lazy";
        String status = "detected";
        int errorCode = 2;

        String formattedMessage = String.format("%s employee %s! Error code: %d", name, status, errorCode);
        System.out.printf("Result of work - %s", formattedMessage);
    }
}
