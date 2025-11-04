package theory.M02_code_organization.S03_object_oriented_programming.MM02_class_hierarchies.SS01_building_class_hierarchies.L04_runtime_type_checking;

import java.util.Arrays;

class Determiner {

    public static void determineWhoIsWho(Employee[] employees) {
        for (Employee employee : employees) {
            switch (employee.getClass().getSimpleName()) {
                case "Employee":
                    System.out.println("EMP");
                    break;
                case "Developer":
                    System.out.println("DEV");
                    break;
                case "DataAnalyst":
                    System.out.println("DA");
            }
        }
    }
}

// Don't change the code below
class Employee {

    protected String name;
    protected String email;
    protected int experience;

/*    public Employee(String name, String email, int experience) {
        this.name = name;
        this.email = email;
        this.experience = experience;
    }*/

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getExperience() {
        return experience;
    }
}

class Developer extends Employee {

    private String mainLanguage;
    private String[] skills;

/*    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills != null ? skills : null;
    }*/

    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return Arrays.copyOf(skills, skills.length);
    }
}

class DataAnalyst extends Employee {

    private boolean phd;
    private String[] methods;

/*    public DataAnalyst(String name, String email, int experience, boolean phd, String[] methods) {
        super(name, email, experience);
        this.phd = phd;
        this.methods = methods != null ? methods : null;
    }*/

    public boolean isPhD() {
        return phd;
    }

    public String[] getMethods() {
        return Arrays.copyOf(methods, methods.length);
    }
}
