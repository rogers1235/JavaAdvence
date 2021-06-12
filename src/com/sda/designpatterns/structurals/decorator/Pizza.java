package com.sda.designpatterns.structurals.decorator;

public interface Pizza {

    void addIngredient(Ingredient ingredient);

    double getPrice();

    void showIngredients();

}
