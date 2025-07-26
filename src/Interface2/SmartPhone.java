package Interface2;

public class SmartPhone implements Camera,MusicPlayer,Phone{
    @Override
    public void takephoto() {
        System.out.println("taking photo with smartphone");
    }

    @Override
    public void recordvideo() {
        System.out.println("Recording video with smartphone");

    }

    @Override
    public void playMusic() {
        System.out.println("Playing video with smartphone");

    }

    @Override
    public void  stopMusic() {
        System.out.println("Stoping music on smartphone ");

    }

    @Override
    public void makecall(String number) {
        System.out.println("Calling " + number + " from smartphone");

    }

    @Override
    public void endcall() {
        System.out.println("Ending call on smartphone");

    }
}
class Runer {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.makecall("100220554");
        smartPhone.endcall();
        smartPhone.stopMusic();
        smartPhone.playMusic();
        smartPhone.takephoto();
        smartPhone.recordvideo();
    }
}

