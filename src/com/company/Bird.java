package com.company;

public abstract class Bird implements DanceImpl {

    public String name;
    public String color;

    public Bird(String name, String color) {
        this.name = name;
        this.color = color;
        System.out.println("--------------------------");
        System.out.println("I'm a bird");
    }

    public abstract void speak();

    public void fly() {
        System.out.println("I'm " + name + " and I can fly high in the blue sky!");
    }

    public void spin() {
        System.out.println(name + " spin!");
    }

    public void doTheCaterpillar() {
        System.out.println(name + " do the wriggly woo!");
    }

    public void jump() {
        System.out.println(name + " jump in the air!");
    }
}
