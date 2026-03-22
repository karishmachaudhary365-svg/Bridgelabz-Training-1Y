package com.gla.Inheritance;

class Chef extends Person implements Worker {

    public Chef(String name, int id) {
        super(name, id);
    }

    @Override
    public void performDuties() {
        System.out.println("Role: Chef");
        displayInfo();
        System.out.println("Duties: Cooking meals and managing the kitchen");
    }

    private void displayInfo() {
    }
}