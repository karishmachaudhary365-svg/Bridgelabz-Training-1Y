package com.gla.Inheritance;

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayRole() {
        System.out.println("Role: Teacher");
        displayBasicInfo();
        System.out.println("Subject: " + subject);
    }
}
