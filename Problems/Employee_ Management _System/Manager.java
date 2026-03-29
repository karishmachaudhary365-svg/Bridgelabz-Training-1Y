package com.gla.Scenario_Based_Problem;

class Manager extends Employee {
    String department;
    Manager(int empId, String name, String department) {
        super(empId, name);
        this.department = department;
    }
    @Override
    String generateEmail() {
        return name.toLowerCase() + "." + department.toLowerCase() + "@company.com";
    }
}
