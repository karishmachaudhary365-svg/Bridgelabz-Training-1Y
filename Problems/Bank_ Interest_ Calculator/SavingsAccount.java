package com.gla.Scenario_Based_Problem;

class SavingsAccount extends Account {

    SavingsAccount(int accountNumber, double balance) {
        super(accountNumber, balance);
    }
    @Override
    double calculateInterest() {
        return balance * 0.04;
    }
}

