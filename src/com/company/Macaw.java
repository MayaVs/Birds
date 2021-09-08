package com.company;

public class Macaw extends Parrot{
    public Macaw(String name, String color){
        super(name, color);
        System.out.println("I'm a Macaw");
    }

    public void type(){
        super.type();
        System.out.println("Macaw is a large parrot");
    }
}
