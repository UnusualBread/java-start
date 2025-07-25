package C01_java.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L07_multiple_constructors;

/*
Below is a class named Phone. It has four fields: ownerName, countryCode,
cityCode and number.
Add two constructors to the class:
    - the first one takes ownerName and number and initializes the corresponding
      fields;
    - the second one takes ownerName, countryCode, cityCode, number and
      initializes all fields.
*/

class Phone {

    String ownerName;
    String countryCode;
    String cityCode;
    String number;

    Phone(String ownerName, String number) {
        this.ownerName = ownerName;
        this.number = number;
    }

    Phone(String ownerName, String countryCode, String cityCode, String number) {
        this.ownerName = ownerName;
        this.countryCode = countryCode;
        this.cityCode = cityCode;
        this.number = number;
    }
}
