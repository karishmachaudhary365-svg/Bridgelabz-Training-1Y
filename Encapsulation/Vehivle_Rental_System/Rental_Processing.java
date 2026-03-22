package com.gla.Encapsulation;

public class Rental_Processing {
    public static void processRental(Vehicle v, int days) {
        v.displayBasicInfo();
        double rentalCost = v.calculateRentalCost(days);
        System.out.println("Rental Cost (" + days + " days): ₹" + rentalCost);

        if (v instanceof Insurable) {
            Insurable i = (Insurable) v;
            double insuranceCost = i.calculateInsurance(days);
            System.out.println(i.getInsuranceDetails());
            System.out.println("Insurance Cost: ₹" + insuranceCost);
            System.out.println("Total Cost: ₹" + (rentalCost + insuranceCost));
        }

        System.out.println("---------------------------");
    }

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car("RJ14-1234", 1500, "CAR-INS-001"),
                new Bike("RJ14-5678", 500, "BIKE-INS-002"),
                new Truck("RJ14-9999", 3000, "TRK-INS-003")
        };

        int days = 3;

        for (Vehicle v : vehicles) {
            processRental(v, days);   // Polymorphism
        }
    }

}
