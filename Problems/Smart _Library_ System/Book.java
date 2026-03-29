package com.gla.Scenario_Based_Problem;

 class Book {
    int bookId;
    String title;
    double price;


    static String libraryName = "City Central Library";

    Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }


    double calculateFine(int daysLate) {
        return 0; // Default (can be overridden)
    }


    void display() {
        System.out.println("Library: " + libraryName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Price: ₹" + price);
    }
}

