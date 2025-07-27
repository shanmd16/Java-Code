package Inner_Class;

public class Runer {
    public static void main(String[] args) {

        ShoppingCart shoppingCart= new ShoppingCart(150);

        shoppingCart.processPayment(new Payment(){

                public void pay(double amount){
            System.out.println("Paid"+ amount + " Using Credit C ard.");
        }
    });
}
}