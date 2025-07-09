package C01_java.M02_code_organization.S02_methods.L03_arrays_as_parameters;

/*
Implement an instance method run(String[] args) that takes an array of strings
and returns nothing. The method should output all the strings in the array,
each on a new line.
*/

public class T03_ArgumentsPrinter {
    void run(String[] args) {
        // implement me
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
