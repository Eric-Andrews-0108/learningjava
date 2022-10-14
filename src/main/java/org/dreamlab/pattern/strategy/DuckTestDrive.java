package org.dreamlab.pattern.strategy;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.fly();
        mallardDuck.quack();
        mallardDuck.describe();
        mallardDuck.swim();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.fly();
        rubberDuck.quack();
        rubberDuck.describe();
        rubberDuck.swim();
        
    }
    
}
