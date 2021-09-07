package com.company;

public class Penguin extends Bird {

    public Penguin(String name, String color) {
        super(name, color);
        System.out.println("I'm a penguin");
    }

    public void speak() {
        System.out.println("Yo! I'm " + name + " and I'm a " + color + " penguin.");
    }

    public void fly() {
        System.out.println("Whoops, I can't fly. Waddle waddle.");
    }
}