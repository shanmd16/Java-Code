package Enum;

public enum Department {
    IT,CS,EC,EI,MECH,CEH,CIVIL

}
    class Main {
        public static void main(String[] args) {
            System.out.println(Department.IT);
            System.out.println(Department.CS);
            System.out.println(Department.EC);
            Department ec = Department.EC;
            int ordinal = ec.ordinal();
            System.out.println(ordinal);
            System.out.println(ec.name());
            Department enumdepartment = Department.valueOf("EC");
            System.out.println(enumdepartment);
            Department[] values = Department.values();
            for (Department i : values) {
                System.out.println(i);

            }
        }
    }



