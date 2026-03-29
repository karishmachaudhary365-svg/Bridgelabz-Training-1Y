package com.gla.Scenario_Based_Problem;

class Magazine extends Book {

    Magazine(int bookId, String title, double price) {
        super(bookId, title, price);
    }

    @Override
    double calculateFine(int daysLate) {
        return daysLate * 5; // ₹5 per day
    }
}
