package com.gla.Inheritance;

public class Main {
    public static void main(String[] args) {

        Animal a1 = new Animal("Buddy", 3);
        Animal a2 = new Animal("Whiskers", 2);
        Animal a3 = new Animal("Tweety", 1);

        Animal[] animals = {a1, a2, a3};

        for (Animal a : animals) {
            a.displayInfo();
            a.makeSound();
            System.out.println("----------------");
        }
        Manager m = new Manager("Amit", 101, 90000, 8);
        Developer d = new Developer("Neha", 102, 70000, "Java");
        Intern i = new Intern("Riya", 103, 20000, 6);

        System.out.println("=== Manager Details ===");
        m.displayDetails();

        System.out.println("\n=== Developer Details ===");
        d.displayDetails();

        System.out.println("\n=== Intern Details ===");
        i.displayDetails();


        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 10.5);
        vehicles[2] = new Motorcycle(150, "Petrol", true);

        for (Vehicle v : vehicles) {
            v.displayInfo();
            System.out.println();


        }

    }
}
