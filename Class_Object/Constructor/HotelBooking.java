package com.gla.Constructor;

public class HotelBooking {
    String guestName;
    String roomType;
    int nights;


    HotelBooking() {
        this("Unknown", "Standard", 1);
    }


    HotelBooking(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }


    HotelBooking(HotelBooking hb) {
        this(hb.guestName, hb.roomType, hb.nights);
    }

    void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking defaultBooking = new HotelBooking();
        HotelBooking paramBooking = new HotelBooking("John Doe", "Deluxe", 3);
        HotelBooking copyBooking = new HotelBooking(paramBooking);

        defaultBooking.display();
        paramBooking.display();
        copyBooking.display();
    }
}
