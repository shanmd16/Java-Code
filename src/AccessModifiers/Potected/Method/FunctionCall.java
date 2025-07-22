package AccessModifiers.Potected.Method;

public class FunctionCall {
    private static String Woof;

    public static void main(String[] args) {
        Dogs dogs =new Dogs("Bob");
        dogs.makeSound();
        dogs.setDogSound("Woof");
        dogs.makeSound();
        dogs.wagTail();
    }
}
