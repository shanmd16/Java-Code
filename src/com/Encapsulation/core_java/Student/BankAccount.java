package com.Encapsulation.core_java.Student;

public class BankAccount {

    private long accountNumber;

    private double balance;

    static int account;

    public void deposit(double amount){
        if(amount >0){
            balance +=amount;
            System.out.println("Deposited:" + amount);
        }else{
            System.out.println("Invalid Deposited AMOUNT");
        }

    }
    public void withdrew(double amount){
        if(amount >0 && amount <= balance){
            balance -= amount;
            System.out.println("Withdrew "+amount);
        }else{
            System.out.println("Invalid amount or Insufficient balance");
        }


    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static int getAccount() {
        return account;
    }
}
