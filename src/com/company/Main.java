package com.company;

public class Main {

    public static void main(String[] args) {
        Pigeon pippa = new Pigeon("Pippa", "Grey");
        pippa.speak();
        pippa.fly();
        pippa.eatPizza();
        pippa.sleep();
        pippa.spin();
        pippa.doTheCaterpillar();
        pippa.jump();

        Penguin pingu = new Penguin("Pingu", "Black & White");
        pingu.speak();
        pingu.fly();
        pingu.spin();
        pingu.doTheCaterpillar();
        pingu.jump();

        Parrot parr = new Parrot("Jago", "Red");
        parr.speak();
        parr.type();

        Lovebirds lovebirds = new Lovebirds("Sisi", "green");
        lovebirds.type();
        lovebirds.speak();

        Macaw macaw = new Macaw("Koko", "red");
        macaw.type();
        macaw.speak();
        macaw.jump();
    }
}
