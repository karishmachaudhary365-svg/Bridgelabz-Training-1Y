package com.gla.Inheritance;

class Car extends Vehicle {
    int seatCapacity;

    public Car(int maxSpeed, String fuelType, int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("---- Car ----");
        super.displayInfo();
        System.out.println("Seat Capacity: " + seatCapacity);
    }
}
