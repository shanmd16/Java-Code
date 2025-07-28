package Exception;

public class Boy2 {
    String name;
    int age;

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

class Mains {
    public static void main(String[] args) {
        Boy2 s1 = new Boy2();
        s1.name="Shan";
        s1.age=20;
        System.out.println(s1);
    }
}
