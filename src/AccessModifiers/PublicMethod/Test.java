package AccessModifiers.PublicMethod;

import AccessModifiers.School.Student;

public class Test {
    public static void main(String[] args) {

           Student student =new Student();
           student.age=12;

        student.name ="Shan";
        student.sayHello();
    }

}
