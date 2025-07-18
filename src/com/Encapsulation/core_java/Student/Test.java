package com.Encapsulation.core_java.Student;

public class Test {
    public static void main(String[] args){
        Student student =  new Student();
        student.setName("Shan");
        student.setAge(15);
        student.setRollNumber(21);
        //student.setAge(15);
        //System.out.println(student.name);
        System.out.println(student.getName());

    }

}
