package com.gla.Inheritance;

public class Persons {
    String name;
    int id;

    public Persons(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
