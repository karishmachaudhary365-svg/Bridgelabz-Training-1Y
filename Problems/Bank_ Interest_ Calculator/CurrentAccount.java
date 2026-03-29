package com.gla.Scenario_Based_Problem;

 class CurrentAccount extends Account {
    CurrentAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    double calculateInterest() {
        return balance * 0.02;
    }
}
