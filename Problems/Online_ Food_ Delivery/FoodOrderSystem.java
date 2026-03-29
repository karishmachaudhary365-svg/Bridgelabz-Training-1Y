package com.gla.Scenario_Based_Problem;

public class FoodOrderSystem {
    public static void main(String[] args) {

        // Polymorphism
        Order o1 = new RegularOrder(1, 500);
        Order o2 = new PremiumOrder(2, 500);

        o1.display();
        System.out.println("Final Bill (Regular): ₹" + o1.calculateBill());

        System.out.println("----------------------");

        o2.display();
        System.out.println("Final Bill (Premium): ₹" + o2.calculateBill());
    }
}