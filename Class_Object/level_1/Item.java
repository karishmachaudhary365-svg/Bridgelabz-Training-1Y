package com.gla.class_and_object;

public class Item {
    String itemName;
    int itemCode;
    double price;


    Item(int code, String name, double price) {
        this.itemCode = code;
        this.itemName = name;
        this.price = price;
    }


    void display(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost for " + quantity + " units: " + (price * quantity));
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Notebook", 50.0);
        item.display(3); // Display total cost for 3 units
    }
}
