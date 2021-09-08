package com.company;

public class Lovebirds extends Parrot{
    public Lovebirds(String name, String color){
        super(name, color);
        System.out.println("I'm a Lovebird");
    }

    public void type(){
        super.type();
        System.out.println("Lovebird is a small parrot");
    }

    public void speak(){
        System.out.println("I love youuuuu");
    }
}
