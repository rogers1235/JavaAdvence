package com.sda.designpatterns.structurals.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        PlainPizza plainPizza = new PlainPizza();

        Mozzarella mozzarella = new Mozzarella(plainPizza);
        mozzarella.addIngredient(new Ingredient("corn", 2));

        mozzarella.showIngredients();
        System.out.println(mozzarella.getPrice());

        PlainPizza customPizza = new PlainPizza();
        Ingredient cheese = new Ingredient("cheese", 1.5);
        customPizza.addIngredient(new Ingredient("ham", 3));
        customPizza.addIngredient(new Ingredient("olives", 2.5));
        customPizza.addIngredient(cheese);

        customPizza.showIngredients();
        System.out.println(customPizza.getPrice());

    }
}
