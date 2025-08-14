package theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L02_keyword_super;

/*
Develop a class hierarchy of employees. The hierarchy should include three classes:
    - Employee is the base class. It includes three fields (name, email and integer
      variable experience), one constructor with three arguments and three getters:
      getName(), getEmail(), getExperience().
    - Developer is a subclass. It includes fields from the base class and two
      additional fields (mainLanguage, skills), one constructor with five arguments and two getters: getMainLanguage(), getSkills().
    - DataAnalyst is another subclass. It includes fields from the base class and two
      additional fields (phd, methods), one constructor with five arguments and two
      getters: isPhd(), getMethods().
*/

class Employee_02 {

    String name;
    String email;
    int experience;

    Employee_02(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }

    String getName() {
        return this.name;
    }

    String getEmail() {
        return this.email;
    }

    int getExperience() {
        return this.experience;
    }
}

class Developer extends Employee_02 {

    String mainLanguage;
    String[] skills;

    Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }

    String getMainLanguage() {
        return this.mainLanguage;
    }

    String[] getSkills() {
        return this.skills;
    }
}

class DataAnalyst extends Employee_02 {

    boolean phd;
    String[] methods;

    DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods;
    }

    boolean isPhd() {
        return this.phd;
    }

    String[] getMethods() {
        return this.methods;
    }
}
