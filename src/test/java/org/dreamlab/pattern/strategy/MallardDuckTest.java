package org.dreamlab.pattern.strategy;


import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;


public class MallardDuckTest {

    private MallardDuck mallardDuck;

    @Before
    public void setup() {
        mallardDuck = new MallardDuck();
    }

    @Test
    public void swim() {
        mallardDuck.swim();
        assertTrue(null, true);
    }
    
}
