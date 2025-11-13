package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L03_static_members;

/*
Write code that prints values of the constants and the results of both methods
in the following order: A_CONSTANT_TTT, B_CONSTANT_QQQ, getMagicString(),
convertStringToAnotherString("aa"). Each value must be printed in a new line.
*/

public class T03_StaticMembersPrinter {

    public static void main(String[] args) {
        // write your code using the existing class ConstantsAndUtilities
        System.out.println(ConstantsAndUtilities.A_CONSTANT_TTT + "\n" + ConstantsAndUtilities.B_CONSTANT_QQQ + "\n" + ConstantsAndUtilities.getMagicString() + "\n" + ConstantsAndUtilities.convertStringToAnotherString("aa"));
    }

}

// Don't change this class
class ConstantsAndUtilities {

    public static final String A_CONSTANT_TTT = "1234";

    public static final String B_CONSTANT_QQQ = "7890";

    public static String getMagicString() {
        return A_CONSTANT_TTT + B_CONSTANT_QQQ;
    }

    public static String convertStringToAnotherString(String s) {
        return A_CONSTANT_TTT + s;
    }
}
