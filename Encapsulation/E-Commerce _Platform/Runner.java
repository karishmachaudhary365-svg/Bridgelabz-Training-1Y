package com.gla.Encapsulation;

public class Runner {
    public static void printFinalPrice(Product p) {
        double price = p.getPrice();
        double discount = p.calculateDiscount();
        double tax = 0;

        if (p instanceof Taxable) {
            Taxable t = (Taxable) p;
            tax = t.calculateTax();
            System.out.println(t.getTaxDetails());
        }

        double finalPrice = price + tax - discount;

        p.displayBasicInfo();
        System.out.println("Discount: ₹" + discount);
        System.out.println("Tax: ₹" + tax);
        System.out.println("Final Price: ₹" + finalPrice);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {

        Product[] products = {
                new Electronics(101, "Laptop", 60000),
                new Clothing(102, "Jacket", 3000),
                new Groceries(103, "Rice Bag", 1200)
        };

        for (Product p : products) {
            printFinalPrice(p);   // Polymorphism
        }
    }

}
