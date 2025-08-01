package Multithreading;

public class Demo {
    public static void main(String[] args) {
        World world =new World();
        world.start();
        for (int i=0;i<10000;i++){
            System.out.println("Hello ");
        }
        System.out.println(Thread.currentThread().getName());
    }
}
 class World extends Thread{
     @Override
     public void run() {
         for (int i=0;i<10000;i++){
             System.out.println("World");
         }
     }
 }