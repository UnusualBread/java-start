package theory.M02_code_organization.S03_object_oriented_programming.MM03_other_concepts.SS01_enumerations.L01_combining_constants_with_enum;

/*
You are given a hidden enum named Secret with some constants in uppercase.
Write a program that counts and prints how many constants in the enumeration
start with "STAR". The enum is accessible during testing.
*/

public class T04_ConstantsCounter {

    public static void main(String[] args) {
        int counter = 0;

        Secret[] secrets = Secret.values();

        for (Secret secret : secrets) {
            if (secret.name().startsWith("STAR")) {
                counter++;
            }
        }

        System.out.println(counter);
    }
}

// sample enum for inspiration
enum Secret {
    STAR, CRASH, START, // ...
}
