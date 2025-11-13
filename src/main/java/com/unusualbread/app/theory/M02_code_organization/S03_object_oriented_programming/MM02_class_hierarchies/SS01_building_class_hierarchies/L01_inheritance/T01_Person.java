package com.unusualbread.app.theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L01_inheritance;

/*
In this problem, you need to develop a class hierarchy for the Hospital System.
The root of the hierarchy is the Person class. It represents all employees and
patients of the Hospital. Doctors are a kind of employee.
*/

class Person {

}

class Employee extends Person{

}

class Doctor extends Employee{

}

class Patient extends Person{

}