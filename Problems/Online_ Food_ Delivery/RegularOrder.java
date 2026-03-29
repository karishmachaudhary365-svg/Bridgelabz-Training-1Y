package com.gla.Scenario_Based_Problem;

 class RegularOrder extends Order {

    RegularOrder(int orderId, double baseAmount) {
        super(orderId, baseAmount);
    }

    // No discount
    @Override
    double calculateBill() {
        return baseAmount + deliveryCharge;
    }
}
