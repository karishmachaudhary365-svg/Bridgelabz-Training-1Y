package com.gla.Inheritance;

class Waiter extends Person implements Worker {

    public Waiter(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Waiter");
        displayInfo();
        System.out.println("Duties: Serving food and attending customers");
    }

    private void displayInfo() {
    }
}
