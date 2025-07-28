package Exception;

public class ExceptionExample {
    public static void main(String[] args) {
        try {
            // Risky code
            int a = 10, b = 0;
            int c = a / b;   // error (divide by zero)
            System.out.println("Result: " + c);
        }
        catch (ArithmeticException e) {
            // Handling error
            System.out.println("Error: Cannot divide by zero!");
        }

        System.out.println("Program continues after exception handling.");
    }
}

