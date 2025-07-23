package Abstarction;

abstract class Lion {
    abstract void sound(); // abstract method
      void eat() {        // Regular method
          System.out.println("Lion eat food");

      }
}
class Tiger extends Lion{
    void sound() {
        System.out.println("Tiger is running");
    }
}
class Main{
    public static void main(String[] args) {
        Lion a= new Tiger();
        a.sound();
        a.eat();

    }
}
