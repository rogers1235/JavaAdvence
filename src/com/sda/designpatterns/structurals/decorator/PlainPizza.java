package com.sda.designpatterns.structurals.decorator;

import java.util.ArrayList;
import java.util.List;

public class PlainPizza implements Pizza {

    private List<Ingredient> ingredientList;
    private double initialCost = 10;

    public PlainPizza() {
        ingredientList = new ArrayList<>();
    }

    @Override
    public void addIngredient(Ingredient ingredient) {
        ingredientList.add(ingredient);
    }

    @Override
    public double getPrice() {
        double totalSum = initialCost;

        for (Ingredient ingredient : ingredientList) {
            totalSum += ingredient.getPrice();
        }

        return totalSum;
    }

    @Override
    public void showIngredients() {
        System.out.println(ingredientList);
    }
}
