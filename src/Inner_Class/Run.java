package Inner_Class;

public class Run {
    public static void main(String[] args) {
        Computer computer =new Computer("Hp","Abc","XYZ");
        computer.getOs().displayInfo();
        Computer.USB usb = new Computer.USB("Type-c");



    }
}
