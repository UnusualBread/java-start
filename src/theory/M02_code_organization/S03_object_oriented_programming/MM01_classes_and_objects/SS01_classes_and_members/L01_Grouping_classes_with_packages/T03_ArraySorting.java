package theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L01_Grouping_classes_with_packages;

/*
The class Arrays provides a number of useful methods for processing arrays.
Among them, there's a commonly used one called sort. It allows you to sort
any array (string array, integer array, or even object array ). It accepts
one argument: the array itself. It modifies the array, returning nothing.
*/

class ArraySorting {
    /**
     * @param array unordered sequence of strings
     * @return ordered array of strings
     */
    public static String[] sortArray(String[] array) {
        java.util.Arrays.sort(array);
        return array;
    }
}
