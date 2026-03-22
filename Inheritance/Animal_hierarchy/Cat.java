package com.gla.Inheritance;

public class Cat {
    public Cat(String whiskers, int i) {
    }

    static class Dog extends Animal {

        public Dog(String name, int age) {
            super(name, age);
        }

        @Override
        public void makeSound() {
            System.out.println("Dog barks: Woof Woof");
        }
    }
}
