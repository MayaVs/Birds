package com.company;

public class Parrot extends Bird {

    public Parrot(String name, String color) {
        super(name, color);
        System.out.println("I'm a parrot");
    }

    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " parrot.");
    }
}