package com.gla.Encapsulation;

class Car extends Vehicle implements Insurable {
    private String insurancePolicyNumber; // sensitive

    public Car(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNo;
    }


    public String getInsurancePolicyNumber() { return insurancePolicyNumber; }
    public void setInsurancePolicyNumber(String policyNo) { this.insurancePolicyNumber = policyNo; }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 200 * days; // fixed per-day insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: ₹200/day (Car)";
    }
}
