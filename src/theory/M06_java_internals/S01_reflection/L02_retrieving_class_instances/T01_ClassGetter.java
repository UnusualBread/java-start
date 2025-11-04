package theory.M06_java_internals.S01_reflection.L02_retrieving_class_instances;

/*
Implement the method that returns the fully qualified class name of the object
provided.
*/

class T01_ClassGetter {

    public String getObjectClassName(Object object) {
        return object.getClass().getName();
    }
}
