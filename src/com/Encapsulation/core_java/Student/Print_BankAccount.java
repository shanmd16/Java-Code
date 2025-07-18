package com.Encapsulation.core_java.Student;


public class Print_BankAccount {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountNumber(1234567889);
        bankAccount.deposit(-10);
        bankAccount.withdrew(10);
        bankAccount.deposit(100);
        bankAccount.withdrew(50);

        System.out.println("Account Number: "+bankAccount.getAccountNumber());
        System.out.println("Account balance: "+bankAccount.getBalance());
//        BankAccount bankBalance = new BankAccount();
//        bankAccount.deposite(-10);
//        bankAccount.withdrew(10);
//        bankAccount.deposit(100);
//        bankAccount.withdrew(10);



    }

}
