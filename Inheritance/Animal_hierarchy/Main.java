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
    }
}
