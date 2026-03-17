package com.gla.class_and_object;

public class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
    MovieTicket(String movieName) {
        this.movieName = movieName;
    }
    void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }
    void display() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: " + price);
    }
    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket("Avengers: Endgame");
        ticket.bookTicket(12, 350.0);
        ticket.display();
    }
}
