package Interface;

public interface Animal {
    public int Max_Age =150;
    public abstract void eat();
    void sleep();
    public static void info(){
        System.out.println("this is an Animal Interface");
    }
    public default void run (){
        this.eat();
        System.out.println("Animal is running");
    }

}
