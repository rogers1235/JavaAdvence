package com.sda.designpatterns.structurals.decorator;

public class PizzaDecorator implements Pizza {

    private Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        pizza.addIngredient(ingredient);
    }

    @Override
    public double getPrice() {
        return pizza.getPrice();
    }

    @Override
    public void showIngredients() {
        pizza.showIngredients();
    }
}
