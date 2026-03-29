package com.gla.Scenario_Based_Problem;

class Order {
    int orderId;
    double baseAmount;


    static double deliveryCharge = 40;


    Order(int orderId, double baseAmount) {
        this.orderId = orderId;
        this.baseAmount = baseAmount;
    }


    double calculateBill() {
        return baseAmount + deliveryCharge; // default
    }


    void display() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Base Amount: ₹" + baseAmount);
    }
}

