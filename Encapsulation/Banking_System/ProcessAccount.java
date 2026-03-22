package com.gla.Encapsulation;

public static void processAccount(BankAccount acc) {
    acc.displayDetails();

    if (acc instanceof Loanable) {
        Loanable loan = (Loanable) acc;
        System.out.println("Loan Eligible: " + (loan.calculateLoanEligibility() ? "Yes" : "No"));
    }

    System.out.println("---------------------------");
}

public static void main(String[] args) {

    BankAccount acc1 = new SavingsAccount("SA101", "Amit", 80000);
    BankAccount acc2 = new CurrentAccount("CA202", "Neha", 120000);

    acc1.deposit(5000);
    acc2.withdraw(10000);

    BankAccount[] accounts = { acc1, acc2 };

    for (BankAccount acc : accounts) {
        processAccount(acc);   // Polymorphism
    }
}

