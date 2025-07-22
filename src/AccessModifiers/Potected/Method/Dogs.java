package AccessModifiers.Potected.Method;

public class Dogs extends Animals{
    public Dogs(String name){
        super(name,"bark");

    }
    public void wagTail() {
        System.out.println(getName() +  "is wagging its tail");
    }
    private String getName(){
        return getClass().getSimpleName();

    }
    public void setDogSound(String newSound){
        changeSound(newSound);
    }

}
