package com.gla.Scenario_Based_Problem;

class Account {
    int accountNumber;
    double balance;

    static String bankName = "ABC Bank";

    Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    double calculateInterest() {
        return 0;
    }
    void display() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

