package org.dreamlab.pattern.strategy;

public class MallardDuck extends Duck {
    MallardDuck() {
        super(new FlyWithWings(), new Quacking());
    }

    @Override
    public void describe() {
        System.out.println("I am a mallard duck.");
    } 

}
