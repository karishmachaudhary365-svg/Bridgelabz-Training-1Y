package com.gla.Inheritance;

class ElectricVehicle extends Vehicle {

    public ElectricVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void charge() {
        System.out.println("Charging the electric vehicle battery...");
    }

    public void showDetails() {
        System.out.println("Type: Electric Vehicle");
        displayInfo();
    }
}
