package com.gla.Constructor;

public class Books {
    String title;
    String author;
    double price;
    boolean available;
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = true;
    }


    void borrow() {
        if(available) {
            available = false;
            System.out.println(title + " has been borrowed.");
        } else {
            System.out.println(title + " is not available.");
        }
    }

    void display() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + available);
    }

    public static void main(String[] args) {
        Book b = new Book("1984", "George Orwell", 350);
        b.display();
        b.borrow();
        b.borrow();
        b.display();
    }
}
