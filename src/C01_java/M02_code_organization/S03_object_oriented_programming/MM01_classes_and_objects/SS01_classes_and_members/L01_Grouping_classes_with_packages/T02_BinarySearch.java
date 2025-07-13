package C01_java.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L01_Grouping_classes_with_packages;

/*
The class Arrays includes a lot of useful methods for processing arrays.
One of them is the binarySearch method. It allows you to quickly find the index
of an element in the given ordered array. You just need to pass the array of
values and the value to search for to this method.

In this quiz, you need to call this method from the Arrays class without using
an import statement.
*/

class BinarySearch {
    /**
     * @param nums ordered sequence of integers
     * @param key  an element for searching
     * @return index of key or a negative value
     */
    public static int callBinarySearch(int[] nums, int key) {
        return java.util.Arrays.binarySearch(nums, key);
    }
}