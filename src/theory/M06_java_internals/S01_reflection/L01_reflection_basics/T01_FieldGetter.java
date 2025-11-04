package theory.M06_java_internals.S01_reflection.L01_reflection_basics;

/*
Implement getNumberOfFieldsClassDeclares method to count the number of fields
declared in a class. You should count public, protected, default (package)
access, and private fields, excluding inherited fields.
*/

class FieldGetter {

    public int getNumberOfFieldsClassDeclares(Class<?> clazz) {
        return clazz.getDeclaredFields().length;
    }
}
