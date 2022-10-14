package org.dreamlab.pattern.strategy;

public abstract class Duck {
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;

    Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavor(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public abstract void describe();

    public void fly() {
        flyBehavior.fly();
    }
    

    public void quack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("Every duck can swim");
    }
}
