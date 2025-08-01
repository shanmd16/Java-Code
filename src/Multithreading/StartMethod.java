package Multithreading;

public class StartMethod extends Thread {

    @Override
    public void run() {
        for( int i=1;i<=5;i++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                throw new RuntimeException(e);

            }
            System.out.println(i);
        }
    }
    public static void main (String [] args){
        StartMethod t1 = new StartMethod();
        t1.start();
    }
}
