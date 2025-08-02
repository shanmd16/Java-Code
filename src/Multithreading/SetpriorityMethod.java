package Multithreading;

public class SetpriorityMethod extends Thread {
    public SetpriorityMethod(String name) {
        super(name);

    }

    @Override
    public void run() {
        for(int i=0; i<5; i++){
            String a = " ";
            for (int j =0;j<10000;j++){
                a+="a";

            }
            System.out.println(Thread.currentThread().getName()  +  " - Priority: "  +  Thread.currentThread().getPriority() +  " count "  +  i);
            try {
                Thread.sleep(10);

            } catch (Exception e){

            }
        }
    }

    public static void main(String[] args) throws InterruptedException{
        SetpriorityMethod l = new SetpriorityMethod("Low Priority Thread");
        SetpriorityMethod m = new SetpriorityMethod("Medium Priority Thread");
        SetpriorityMethod n = new SetpriorityMethod("High Priority Thread");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        n.start();




    }
}
