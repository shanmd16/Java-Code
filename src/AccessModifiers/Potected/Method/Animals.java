package AccessModifiers.Potected.Method;

public class Animals {
    private String name;
    protected String sound;

    public Animals(String name, String sound){
        this.name =name;
        this.sound =sound;
}
public void makeSound(){
    System.out.println(name+"makes a sound:"+sound);
}
protected void changeSound(String newSound){
        this.sound =newSound;

}
}
