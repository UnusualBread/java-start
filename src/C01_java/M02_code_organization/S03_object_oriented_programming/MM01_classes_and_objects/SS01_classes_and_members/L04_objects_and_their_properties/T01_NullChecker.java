package C01_java.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L04_objects_and_their_properties;

/*
Write a method that checks if the object passed to it is null or not. If it is
null, the method must print "It's null" and if not it must print "It's an
object".
*/

import java.util.Scanner;

class Solution {

    public void printIsNull(Object o) {
        // write your code here
        System.out.println(o == null ? "It's null" : "It's an object");
    }
}

// Do not change the code below
class T01_NullChecker {
    public static void main(String[] args) {
        Solution solution = new Solution();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            Object obj = "null".equals(scanner.nextLine()) ? null : new Object();
            solution.printIsNull(obj);
        }
    }
}
