package com.gla.Encapsulation;

class Truck extends Vehicle implements Insurable {
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNo) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNo;
    }

    public String getInsurancePolicyNumber() { return insurancePolicyNumber; }
    public void setInsurancePolicyNumber(String policyNo) { this.insurancePolicyNumber = policyNo; }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days + 500; // extra heavy-duty charge
    }

    @Override
    public double calculateInsurance(int days) {
        return 350 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: ₹350/day (Truck)";
    }
}
