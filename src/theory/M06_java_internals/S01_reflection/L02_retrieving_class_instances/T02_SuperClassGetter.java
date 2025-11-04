package theory.M06_java_internals.S01_reflection.L02_retrieving_class_instances;

/*
Implement the two methods: getSuperClassByName and getSuperClassByInstance.

getSuperClassByInstance accepts one argument, the instance of objects. The
method should return the superclass of the given object.

getSuperClassByName accepts one argument, string name of the class. It should
return the superclass of the class with the name as in parameter.
*/

class T02_SuperClassGetter {

    public Class getSuperClassByName(String name) throws ClassNotFoundException {
        return Class.forName(name).getSuperclass();
    }

    public Class getSuperClassByInstance(Object object) {
        return object.getClass().getSuperclass();
    }
}
