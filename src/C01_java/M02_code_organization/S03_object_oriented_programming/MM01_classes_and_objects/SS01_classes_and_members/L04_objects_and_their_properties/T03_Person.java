package C01_java.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L04_objects_and_their_properties;

class Person {
    String name;
    int age;
}

class MakingChanges {
    public static void changeIdentities(Person p1, Person p2) {
        // write your code here
        String tempName = p1.name;
        int tempAge = p1.age;
        p1.name = p2.name;
        p1.age = p2.age;
        p2.name = tempName;
        p2.age = tempAge;
    }
}
