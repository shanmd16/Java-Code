package Multithreading;

public class D_ManMethod extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("Hello World");

        }
    }
    public static void main(String[] args){
        D_ManMethod s1Thread = new D_ManMethod();
        s1Thread.setDaemon(true);
        D_ManMethod t1 = new D_ManMethod();
        t1.start();
        s1Thread.start();
        System.out.println("Main done");

    }
}
