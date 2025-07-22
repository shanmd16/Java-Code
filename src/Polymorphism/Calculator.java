package Polymorphism;
//Run time polymorphism
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}
    class Run {
         public static void main(String[] args) {
             Calculator num =new Calculator();
             System.out.println(num.add(5,10));
             System.out.println(num.add(5,10,15));
             System.out.println(num.add(5.5,10.5));

         }
     }


