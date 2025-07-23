package Polymorphism;
// Run time Polymorphism
public class  Teacher {
    void sound(){
        System.out.println("teacher asks question to student");

    }
}
class Student extends Teacher{
    void sound(){
        System.out.println("student tell the answer to the question");

    }
}
class Main{
    public static void main(String[] args) {
        Teacher a= new Teacher();
        a.sound();
    }
}