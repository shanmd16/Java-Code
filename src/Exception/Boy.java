package Exception;

public class Boy {
    String name;
    int age;
}
// Default behaviour of toString() it prints tu yah object default output deta h o/p class name+"@"+hashcode;
class Main {
    public static void main(String[] args) {
        Boy s1 = new Boy();
        s1.name="Shan";
        s1.age=20;
        System.out.println(s1);
    }
}

