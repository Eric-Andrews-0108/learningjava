package org.dreamlab.pattern.strategy;

public class Quacking implements QuackBehavior {
    public void quack() {
        System.out.println("quack, quack");
    }
}
