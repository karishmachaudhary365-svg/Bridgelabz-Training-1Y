package com.gla.Scenario_Based_Problem;

public class LibrarySystem {
    public static void main(String[] args) {


    Book b1 = new TextBook(101, "Java Programming", 500);
    Book b2 = new Magazine(202, "Tech Monthly", 150);

    b1.display();
    System.out.println("Fine (TextBook, 3 days late): ₹" + b1.calculateFine(3));

    System.out.println("----------------------");

    b2.display();
    System.out.println("Fine (Magazine, 3 days late): ₹" + b2.calculateFine(3));
}
}