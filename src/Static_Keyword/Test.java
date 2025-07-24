package Static_Keyword;

public class Test {
    public static void main(String[] args) {
        Student student1 =new Student();
        Student student2 =new Student();
        Student student3 =new Student();
        Student student4 =new Student();
        Student student5 =new Student();
        // class kee help say getcountMethod call
        Student.getCount();

       //count variable call
        System.out.println(Student.count);
        System.out.println(Utils.max(1,22));
        System.out.println(Utils.min(1,22));
    }
}
