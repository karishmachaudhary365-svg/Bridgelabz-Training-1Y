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
        Author book1 = new Author(
                "The Java Handbook",
                2022,
                "Rohit Sharma",
                "Software developer and programming instructor"
        );

        book1.displayInfo();

        Thermostat t1 = new Thermostat("TH101", "ON", 22.5);
        t1.displayStatus();


        Order o1 = new Order("ORD1001", "20-Mar-2026");
        Order o2 = new ShippedOrder("ORD1002", "19-Mar-2026", "TRK12345");
        Order o3 = new DeliveredOrder("ORD1003", "18-Mar-2026", "TRK67890", "22-Mar-2026");

        o1.displayInfo();
        System.out.println();

        o2.displayInfo();
        System.out.println();

        o3.displayInfo();

        PaidOnlineCourse course = new PaidOnlineCourse(
                "Java Programming",
                40,
                "Udemy",
                true,
                3999,
                20
        );

        course.displayInfo();
        BankAccount acc1 = new SavingsAccount("SA123", 50000, 4.5);
        BankAccount acc2 = new CheckingAccount("CA456", 30000, 10000);
        BankAccount acc3 = new FixedDepositAccount("FD789", 100000, 24);

        acc1.displayDetails();
        System.out.println();

        acc2.displayDetails();
        System.out.println();

        acc3.displayDetails();


        Person p1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Person p2 = new Student("Ananya", 16, "Grade 11");
        Person p3 = new Staff("Ramesh", 35, "Administration");

        ((Teacher)p1).displayRole();
        System.out.println();

        ((Student)p2).displayRole();
        System.out.println();

        ((Staff)p3).displayRole();


        Worker w1 = new Chef("Arjun", 101);
        Worker w2 = new Waiter("Priya", 102);

        w1.performDuties();
        System.out.println();

        w2.performDuties();
    }
    }



