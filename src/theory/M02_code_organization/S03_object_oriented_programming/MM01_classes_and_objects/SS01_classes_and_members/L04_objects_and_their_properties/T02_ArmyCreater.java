package theory.M02_code_organization.S03_object_oriented_programming.MM01_classes_and_objects.SS01_classes_and_members.L04_objects_and_their_properties;

/*
You decide to recall the happy days of your childhood and play Heroes.
Of course, you need an army.
Your task is to create objects: 5 Unit, 3 Knight, 1 General, 1 Doctor.
Don't forget to give them names!
*/

class Army {

    public static void createArmy() {
        Unit unit;
        Knight knight;
        General general;
        Doctor doctor;

        for (int i = 0; i < 5; i++) {
            unit = new Unit("Bob" + (i + 1));
            if (i % 2 == 0) {
                knight = new Knight("Jojo" + (i / 2 + 1));
            }
        }
        general = new General("Archangel");
        doctor = new Doctor("Loki");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}
