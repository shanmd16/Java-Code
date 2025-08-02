package Multithreading;

public class Counter {
    private int count = 0;

    public synchronized void increment() {
        count++;

    }

    public int getCount() {
        return count;
    }
}


 class YourThread extends Thread {
    private Counter counter;
    public YourThread(Counter counter){
        this.counter = counter;

    }

     @Override
     public void run() {
         for ( int i = 0; i<1000;i++){
             counter.increment();
         }
     }
 }
 class Main {
     public static void main(String[] args) {
         Counter counter = new Counter();

         YourThread t1 = new YourThread(counter);
         YourThread t2 = new YourThread(counter);
         t1.start();
         t2.start();
         try {
             t1.join();
             t2.join();
         } catch (Exception e) {
         }
         System.out.println(counter.getCount());
         }
     }
