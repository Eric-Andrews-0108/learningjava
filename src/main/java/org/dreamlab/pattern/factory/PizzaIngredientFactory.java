package org.dreamlab.pattern.factory;

public interface PizzaIngredientFactory {
    Dough createDough();
    Sauce createSauce();
    Cheese createCheese();
    Veggies[] createVeggies();
    Pepperoni creatPepperoni();
    Clams createClams();
}
