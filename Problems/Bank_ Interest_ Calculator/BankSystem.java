package com.gla.Scenario_Based_Problem;

public class BankSystem {
    public static void main(String[] args) {

        // Polymorphism (parent reference)
        Account a1 = new SavingsAccount(101, 10000);
        Account a2 = new CurrentAccount(202, 10000);

        a1.display();
        System.out.println("Interest (Savings): ₹" + a1.calculateInterest());

        System.out.println("----------------------");

        a2.display();
        System.out.println("Interest (Current): ₹" + a2.calculateInterest());
    }
}
