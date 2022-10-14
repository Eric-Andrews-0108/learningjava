package org.dreamlab.pattern.strategy;

public class RubberDuck extends Duck {
    RubberDuck() {
        super(new FlyNoWay(), new MuteQuack());
    }

    @Override
    public void describe() {
        System.out.println("I am a rubber duck.");
    }
}
