package com.gla.Inheritance;

class Truck extends Vehicle {
    double loadCapacity; // in tons

    public Truck(int maxSpeed, String fuelType, double loadCapacity) {
        super(maxSpeed, fuelType);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        System.out.println("---- Truck ----");
        super.displayInfo();
        System.out.println("Load Capacity: " + loadCapacity + " tons");
    }
}
