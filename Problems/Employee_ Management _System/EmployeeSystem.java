package com.gla.Scenario_Based_Problem;

 public class EmployeeSystem {
    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Karishma");
        Employee e2 = new Manager(102, "Rohan", "HR");

        e1.display();
        System.out.println("Email: " + e1.generateEmail());

        System.out.println("----------------------");

        e2.display();
        System.out.println("Email: " + e2.generateEmail());
    }
}
