package com.gla.Inheritance;

class Staff extends Person {
    String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public void displayRole() {
        System.out.println("Role: Staff");
        displayBasicInfo();
        System.out.println("Department: " + department);
    }
}