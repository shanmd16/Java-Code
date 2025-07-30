//package Exception;
//
//
//public class InsufficientFundsException extends Exception{
//    private double amount;
//
//    public InsufficientFundsException(double amount) {
//        super("what do you want? You don't have money");
//        this.amount = amount;
//    }
//
//    public double getAmount() {
//
//        return amount;
//      }
//}
//
// public class Tester{
//     public static void main(String[] args) {
//         BankAccount bankAccount =new BankAccount(10);
//         try {
//             bankAccount.withdraw(11);
//
//         } catch (InsufficientFundsException e) {
//             System.out.println(e);
//         }
//         }
//     }