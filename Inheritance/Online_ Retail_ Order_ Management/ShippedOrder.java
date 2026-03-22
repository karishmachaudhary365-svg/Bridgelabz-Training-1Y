package com.gla.Inheritance;

class ShippedOrder extends Order {
    String trackingNumber;

    public ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    @Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Tracking Number: " + trackingNumber);
    }
}
