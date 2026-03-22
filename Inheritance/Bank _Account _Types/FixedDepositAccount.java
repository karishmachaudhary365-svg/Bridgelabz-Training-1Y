package com.gla.Inheritance;

class FixedDepositAccount extends BankAccount {
    int maturityPeriod; // in months

    public FixedDepositAccount(String accountNumber, double balance, int maturityPeriod) {
        super(accountNumber, balance);
        this.maturityPeriod = maturityPeriod;
    }

    public void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    public void displayDetails() {
        displayAccountType();
        super.displayDetails();
        System.out.println("Maturity Period: " + maturityPeriod + " months");
    }
}
