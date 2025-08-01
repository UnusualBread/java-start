package C01_java.M01_basics.S03_simple_programs.L03_formatted_output;

/*
Look at this code:

String name = "galactic hunter";
String learning  = "java";
String combinedString = name + " learning " + learning;
System.out.println(combinedString);

We have a string combinedString in which strings and variables are combined
using the + operator. Your task is to rewrite the code using printf or format.
The output mustn't change.
*/

public class T02_StringPrinter {
    public static void main(String[] args) {
        String name = "galactic hunter";
        String learning  = "java";

        String result = String.format("%s learning %s", name, learning);
        System.out.println(result);
    }
}
