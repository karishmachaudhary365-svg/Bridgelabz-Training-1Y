package com.gla.Constructor;

public class Person {
    String name;
    int age;
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        Person original = new Person("Alice", 25);
        Person clone = new Person(original);

        original.display();
        clone.display();
    }
}
