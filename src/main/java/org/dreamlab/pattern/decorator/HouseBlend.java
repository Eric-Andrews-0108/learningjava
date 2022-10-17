package org.dreamlab.pattern.decorator;

public class HouseBlend extends Beverage {

    HouseBlend() {
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }
    
}
