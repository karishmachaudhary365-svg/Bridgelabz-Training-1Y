package com.gla.Encapsulation;

public class Main {
    public static void main(String[] args) {

        Employee e1 = new FullTimeEmployee(101, "Amit", 50000);
        Employee e2 = new PartTimeEmployee(102, "Neha", 0, 80, 500);

        ((Department)e1).assignDepartment("IT");
        ((Department)e2).assignDepartment("Support");

        Employee[] employees = { e1, e2 };

        for (Employee emp : employees) {
            emp.displayDetails();   // Polymorphism
            System.out.println();
        }
    }
}
