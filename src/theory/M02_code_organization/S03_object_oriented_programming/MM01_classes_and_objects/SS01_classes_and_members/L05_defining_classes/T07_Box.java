package theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L05_defining_classes;

/*
Define a class named Box. It must have four fields:
    1. length, height and width of the double type.
       Please don't make these fields private.
    2. a field named innerBox of the same type as the defined class
*/

class T07_Box {
    double length, height, width;
    T07_Box innerBox;
}
