package com.gla.Encapsulation;

class Bike extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Bike", rentalRate);
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
        return 80 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: ₹80/day (Bike)";
    }
}
