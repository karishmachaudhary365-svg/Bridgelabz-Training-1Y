package com.gla.class_and_object;

public class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

        BankAccount(String holder, int number, double balance) {
        this.accountHolder = holder;
        this.accountNumber = number;
        this.balance = balance;
    }

     void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }


    void withdraw(double amount) {
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }


    void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 12345, 5000);
        account.displayBalance();
        account.deposit(2000);
        account.withdraw(1000);
        account.withdraw(7000); // insufficient
        account.displayBalance();
    }
}
