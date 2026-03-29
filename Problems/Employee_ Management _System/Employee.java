package com.gla.Scenario_Based_Problem;

class Employee {
    int empId;
    String name;

    Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }
    String generateEmail() {
        return name.toLowerCase() + "@company.com";
    }
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
    }
}