package Exception;

public class FinallyKeyword {
    public static void main(String[] args) {
        try{
            System.out.println("Inside try block");
            int result=10/0;
        }catch (ArithmeticException e){
            System.out.println("Exception caught:"+e);
        } finally{
            System.out.println("Inside finally block");
        }
    }
}
