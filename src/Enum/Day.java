package Enum;

public enum Day {


    SUNDAY("Sunday", "Ravivar"),
    MONDAY("Monday", "Somvar"),
    TUESDAY("Tuesday", "Mangalvar"),
    WEDNESDAY("Wednesday", "Budhvar"),
    THURSDAY("Thursday", "Guruwar"),
    FRIDAY("Friday", "Shukravar"),
    SATURDAY("Saturday", "Shanivar");

    private Day(String lower,String hindi){
        this.lower=lower;
        this.hindi=hindi;
    }
    public String getLower(){
        return lower;
    }
    public String getHindi(){
        return hindi;
    }
    private String lower;
    private String hindi;

    // Method
    public void display(){
        System.out.println("Today is " +this.name());
    }

}
class Check{
    public static void main(String[] args) {
        Day monday =Day.MONDAY;
        System.out.println(monday.getLower());
        System.out.println(monday.getHindi());
        monday.display();
    }
}
