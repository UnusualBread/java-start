package theory.M06_java_internals.S01_reflection.L02_retrieving_class_instances;

/*
Implement a method that will find a class containing a method with a specified
name. This method accepts two arguments, the name of the method and an array of
fully-qualified class names, where:

methodName is the name of the method that needs to be found;

classNames contains one class that has the method with the given name.

It should return the fully-qualified name of the class that has the method with
the given name.
*/

import java.lang.reflect.Method;

class T03_MethodFinder {

    public static String findMethod(String methodName, String[] classNames) throws ClassNotFoundException {
        for (String clazz : classNames) {
            for (Method method : Class.forName(clazz).getMethods()) {
                if (method.getName().equals(methodName)) return clazz;
            }
        }
        return null;
    }
}