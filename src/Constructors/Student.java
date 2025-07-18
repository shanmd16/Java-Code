package Constructors;

public class Student {
    private String name;

    private int rollNumber;

    private int age;

//    public Student(){
//        this.age =10;
//    }

    public Student(String name,int rollNumber,int age){
        this.age =age;
        this.name =name;
        this.rollNumber =rollNumber;

    }

    public Student(String name){
        this.name =name;
    }

    public Student(int rollNUmber){
        this.rollNumber =rollNumber;
    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoolNumber() {
        return rollNumber;
    }

    public void setRoolNumber(int roolNumber) {
        this.rollNumber = roolNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
