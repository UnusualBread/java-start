package C01_java.M02_code_organization.S03_object_oriented_programming.MM03_other_concepts.SS01_enumerations.L02_fields_and_methods_in_enum;

/*
You are given an enum named DangerLevel.
Add an integer field to store danger levels and match the number with each
constant:
HIGH — 3
MEDIUM — 2
LOW — 1
You should also add the instance method getLevel that returns the associated
integer number.
*/

enum DangerLevel {
    HIGH(3),
    MEDIUM(2),
    LOW(1);

    final int level;

    DangerLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }
}
