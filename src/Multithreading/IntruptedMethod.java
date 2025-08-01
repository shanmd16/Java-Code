package Multithreading;

public class IntruptedMethod extends Thread {
    @Override
    public void run() {
      try {
          Thread.sleep(1000);
          System.out.println("Thread is running ");
      } catch (InterruptedException e){
            System.out.println("Thread Intrupted:" +e);


      }

    }

    public static void main(String[] args) throws InterruptedException {
        IntruptedMethod t1 = new IntruptedMethod();
        t1.start();
        t1.interrupt();

    }
}
