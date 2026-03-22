package com.gla.Inheritance;

class Motorcycle extends Vehicle {
    boolean hasGear;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasGear) {
        super(maxSpeed, fuelType);
        this.hasGear = hasGear;
    }

    @Override
    public void displayInfo() {
        System.out.println("---- Motorcycle ----");
        super.displayInfo();
        System.out.println("Has Gear: " + (hasGear ? "Yes" : "No"));
    }
}
