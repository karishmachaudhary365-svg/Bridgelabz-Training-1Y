package com.gla.Scenario_Based_Problem;

class PremiumOrder extends Order {

    PremiumOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    // 20% discount
    @Override
    double calculateBill() {
        double discount = baseAmount * 0.20;
        return (baseAmount - discount) + deliveryCharge;
    }
}
