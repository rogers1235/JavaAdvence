package com.sda.designpatterns.structurals.decorator;

public class Mozzarella extends PizzaDecorator{

    public Mozzarella(Pizza pizza) {
        super(pizza);
        addIngredient(new Ingredient("cheese", 1.5));
    }

}
