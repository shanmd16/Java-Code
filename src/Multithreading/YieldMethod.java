package Multithreading;

public class YieldMethod extends Thread {
    public YieldMethod(String name) {
        super(name); // parent class constructor
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
             System.out.println(Thread.currentThread().getName() + " - running");
            // System.out.println(Thread.currentThread().setPriority(1));
            Thread.yield(); // chance another thread
        }
    }

    public static void main(String[] args) throws InterruptedException {
        YieldMethod t1 = new YieldMethod("t1");
        YieldMethod t2 = new YieldMethod("t2");
        t2.setPriority(9);
        t1.start();
        t2.start();
    }
}




